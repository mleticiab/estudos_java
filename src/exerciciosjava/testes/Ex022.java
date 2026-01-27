/*

Leia 5 números inteiros.
Mostre quantos deles são positivos.

 */

package exerciciosjava.testes;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contador);

        sc.close();
    }
}

