// Com base na tabela abaixo, escreva um programa que leia
// o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

// CODIGO        ESPECIFICAÇÃO        PREÇO
//   1           Cachorro quente      R$4,00
//   2           x- salada            R$4,50
//   3           x-bacon              R$5,00
//   4           torrada simples      R$2,00
//   5           refrigerante         R$1,50

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quant;
        double total;
        double soma = 0;

        do {
            System.out.println("Digite o codigo e quantidade que você deseja comprar (ou 0 para sair): ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                System.out.println("Sistema encerrado.");
                break;
            }

            quant = sc.nextInt();

            if (codigo == 1) {
                total = quant * 4.00;

            } else if (codigo == 2) {
                total = quant * 4.50;

            } else if (codigo == 3) {
                total = quant * 5.00;

            } else if (codigo == 4) {
                total = quant * 2.00;

            } else if (codigo == 5) {
                total = quant * 1.50;

            } else {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }

            soma += total;

            System.out.printf("Total: R$ %.2f, e a soma atual de tudo é R$ %.2f.%n", total, soma);

        } while (true);

        sc.close();

    }
}
