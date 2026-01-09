package org.example.labs;

import org.example.test.Contato;
import org.example.vetor.Lista;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // criacao das variaveis

        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade

        Lista<Contato> lista = new Lista<>(20);
        // criar e adicionar 30 contatos
            criarContatosDinamicamente(5, lista);

        // criar um menu para que o usuuario escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11: imprimirVetor(lista);
                    break;

                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado");
    }


    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome ", scan);
        String email = leInformacao("Entre com o email ", scan);
        String telefone = leInformacao("Entre com a telefone ", scan);

        Contato contato = new Contato(nome, email, telefone);
        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome ", scan);
        String email = leInformacao("Entre com o email ", scan);
        String telefone = leInformacao("Entre com a telefone ", scan);

        Contato contato = new Contato(nome, email, telefone);
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            System.out.println("Contato adicionado com sucesso!");
            lista.adiciona(pos, contato);
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Erro ao adicionar o contato!");
        }


    }

    protected static int leInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();
                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida digite novamente");

            }
        }


        return num;
    }


    protected static String leInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    protected static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar Contato no final do vetor");
            System.out.println("2 - Adicionar Contato em uma posicao especifica");
            System.out.println("3 - Consultar Contato em uma posicao especifica");
            System.out.println("4 - Consulta contato");
            System.out.println("5 - Consulta o ultimo indice do contato");
            System.out.println("6 - Verificar se o contato existe");
            System.out.println("7 - Remover por posição");
            System.out.println("8 - Excluir o contato");
            System.out.println("9 - Verificar tamanho do vetor");
            System.out.println("10 - Excluir todos os contatos");
            System.out.println("11 - Imprime vetor");
            System.out.println("0 - Sair");


            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida digite novamente");
            }


        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        for (int i = 0; i < quantidade; i++) {
            Contato contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setEmail("contato" + i + "@gmail.com");
            contato.setTelefone("111111" + i);

            lista.adiciona(contato);
        }
    }


    protected static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe segue os dados: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void obtemContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posicao: " + pos);
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado: ");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado na posicao: " + pos);
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);
            if (existe) {
                System.out.println("Contato existe, seguem os dados: " + pos);
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }


        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            lista.remover(pos);
            System.out.println("Contato excluido com sucesso");


        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remover(contato);
            System.out.println("Contato excluido com sucesso");


        } catch (Exception e) {
            System.out.println("Entrada inválida digite novamente");
        }
    }

    protected static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor: " + lista.tamanho());
    }

    protected static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }

    protected static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }
}
