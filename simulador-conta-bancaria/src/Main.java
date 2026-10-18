import org.hangell.contabanco.contaterminal.ContaTerminal;
import org.hangell.contabanco.contaterminal.GerenciadorContas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorContas gerenciador = new GerenciadorContas(10);
        gerenciador.adicionar(
                new ContaTerminal(1021, "067-8", "MARIO ANDRADE", 237.48)
        );
        int opcao = 0;
        boolean exit = false;

        System.out.println("Conta Banco!");
        while (!exit) {
            System.out.println("------------------");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Acessar conta");
            System.out.println("3 - Listar contas");
            System.out.println("4 - Sair");
            System.out.println("------------------");

            boolean opcaoValido = false; //reinicia a cada volta do menu

            while (!opcaoValido) {
                System.out.printf("Digite opcao: ");
                if (sc.hasNextInt()) {
                    opcao = sc.nextInt();
                    opcaoValido = true;
                } else {
                    System.out.println("Valor invalido! Digite um numero inteiro para opção");
                    sc.next();
                }
            }

            switch (opcao) {
                case 1:
                    System.out.printf("Você escolheu " + opcao);
                    break;
                case 2:
                    sc.nextLine(); // Consome a quebra de linha do nextInt()

                    System.out.print("Digite sua agência: ");
                    String agencia = sc.nextLine();

                    System.out.print("Digite seu nome: ");
                    String nome = sc.nextLine();

                    ContaTerminal conta = gerenciador.buscarPorAgenciaENome(
                            agencia, nome
                    );

                    if (conta != null) {
                        System.out.printf(
                                "Olá %s, obrigado por criar uma conta em nosso banco, " +
                                        "sua agência é %s, conta %d e seu saldo R$ %.2f " +
                                        "já está disponível para saque.%n",
                                conta.getNomeCliente(),
                                conta.getAgencia(),
                                conta.getNumero(),
                                conta.getSaldo()
                        );
                    } else {
                        System.out.println("Conta não encontrada!");
                    }

                    break;
                case 3:
                    gerenciador.listar();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    try {
                        Thread.sleep(3000); // espera 3 segundos
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Opcao invalida! Escolha de 1 a 4.");
            }
        }
        sc.close();
    }
}