import java.util.Scanner;

/**
 * Desafio: Produto de dois números inteiros
 * Autor: Rodrigo Rangel
 * Data: Outubro de 2026
 *
 * Desafio:
 * Ler dois valores inteiros, calcular o produto entre eles
 * e armazenar o resultado na variável PROD.
 *
 * Entrada:
 * Dois valores inteiros, um por linha.
 *
 * Saída:
 * Exibir "PROD = resultado", com um espaço antes e depois
 * do sinal de igualdade.
 *
 * Exemplos:
 * Entrada: 3 e 9    → Saída: PROD = 27
 * Entrada: -30 e 10 → Saída: PROD = -300
 * Entrada: 0 e 9    → Saída: PROD = 0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Calcula o Produdo de AxB");
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, PROD;
        boolean aValido = false,  bValido = false;

        //Lê A até receber um int
        while(!aValido) {
            System.out.print("Informe um valor numerico para A: ");
            if(sc.hasNextInt()) {
                A = sc.nextInt();
                aValido = true;
            } else {
                System.out.print("Valor invalido! Digite um numero inteiro para A.");
                sc.next();
            }
        }

        //Lê B até receber um int
        while(!bValido) {
            System.out.print("Informe um valor numerico para B: ");
            if(sc.hasNextInt()) {
                B = sc.nextInt();
                bValido = true;
            } else {
                System.out.print("Valor invalido! Digite um numero inteiro para B.");
                sc.next();
            }
        }
        PROD = A * B;

        System.out.println("PROD = " + PROD);
        sc.close();
    }
}