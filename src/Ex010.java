// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.printf("O número %d é PAR.", n);
        } else {
            System.out.printf("O número %d é ÍMPAR.", n);
        }

        sc.close();
    }
}
