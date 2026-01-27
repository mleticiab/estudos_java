/*

Leia um número inteiro X (1 ≤ X ≤ 1000).
Mostre todos os números de 1 até X que sejam múltiplos de 3.

 */

package exerciciosjava.testes;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro qualquer: ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
