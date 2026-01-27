/*

Leia dois valores inteiros A e B (1 ≤ A < B ≤ 1000).
Mostre todos os números ímpares entre A e B, inclusive.

 */

package exerciciosjava.testes;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Digite um número inteiro qualquer: ");
        A = sc.nextInt();

        System.out.print("Digite um número inteiro maior que o anterior: ");
        B = sc.nextInt();

        for (int i = A; i < B; i++ ) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
