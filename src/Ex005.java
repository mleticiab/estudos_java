// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double horasTrabalhadas;
        double valorHoras;
        double salario;

        System.out.println("Código do funcionário: ");
        codigo = sc.nextInt();

        System.out.println("Número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Valor recebido por hora: ");
        valorHoras = sc.nextDouble();

        salario = horasTrabalhadas * valorHoras;

        System.out.printf("O funcionário de código " + codigo + " trabalhou " + horasTrabalhadas +
                " horas, onde cada hora tem o valor de %.2f, e vai receber o salário de R$ %.2f", valorHoras, salario);

        sc.close();
    }
}
