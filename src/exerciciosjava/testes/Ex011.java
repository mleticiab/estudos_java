package exerciciosjava.testes;// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
// mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os
// valores lidos são múltiplos entre si. Atenção: os números devem poder
// ser digitados em ordem crescente ou decrescente.

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, opc;

        do {
            System.out.println("Digite o primero número: ");
            n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();

            if (n1 % n2 == 0 || n2 % n1 == 0) {
                System.out.printf("Os números %d e %d são MÚLTIPLOS.", n1, n2);
            } else {
                System.out.println("Os números não são múltiplos.");
            }

                System.out.println(" Deseja continuar?");
                System.out.println("Sim - 1");
                System.out.println("Sair - 0");
                System.out.print("Opção: ");
                opc = sc.nextInt();

        } while (opc ==1 );

        System.out.println("Encerrado.");
        sc.close();
    }

}
