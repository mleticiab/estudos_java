package exerciciosjava.testes;//
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaTrapezio, areaCirculo, areaQuadrado, areaRetangulo;

        System.out.println("Digite o primeiro número: ");
        A = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        B = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = 2 * 3.14159 * C * C;
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.println("TRIÂNGULO: " + areaTriangulo);
        System.out.println("CIRCULO: " + areaCirculo);
        System.out.println("TRAPÉZIO: " + areaTrapezio);
        System.out.println("QUADRADO: " + areaQuadrado);
        System.out.println("RETÂNGULO: " + areaRetangulo);

        sc.close();
    }
}
