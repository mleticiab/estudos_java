/*

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

 */

package exerciciosjava.testes;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Indira o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A soma de " + a + " e " + b + " é " + soma);

        sc.close();
    }
}
