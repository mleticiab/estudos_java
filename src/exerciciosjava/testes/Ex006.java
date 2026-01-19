package exerciciosjava.testes;// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, codigo2, quantPeca, quantPeca2;
        double valorUnitario1, valorUnitario2, soma;

        System.out.println("Digite o codigo da peça 1 : ");
        codigo = sc.nextInt();

        System.out.println("Digite o número de peças 1: ");
        quantPeca = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o codigo da peça 2: ");
        codigo2 = sc.nextInt();

        System.out.println("Digite o número de peças 2: ");
        quantPeca2 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        valorUnitario2 = sc.nextDouble();

        soma = quantPeca * valorUnitario1 + quantPeca2 * valorUnitario2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", soma);

        sc.close();

    }
}
