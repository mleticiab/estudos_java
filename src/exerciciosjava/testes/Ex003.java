/*

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 */

package exerciciosjava.testes;//

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("A área do círculo é %.4f", area);

        sc.close();

    }
}
