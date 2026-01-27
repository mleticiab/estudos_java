/*

Leia um número inteiro N (1 ≤ N ≤ 1000).
Mostre todos os números pares de 1 até N, um por linha.

 */

package exerciciosjava.testes;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número inteiro qualquer: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
