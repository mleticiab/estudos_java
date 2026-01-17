//Leia a hora inicial e a hora final de um jogo. A seguir calcule
// a duração do jogo, sabendo que o mesmo pode começar em um dia e
// terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1, h2, duracao;

        System.out.println("Digite a hora inicial do jogo: ");
        h1 = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        h2 = sc.nextInt();

        if (h1 < h2) {
            duracao = h2 - h1;
        } else {
            duracao = 24 - h1 + h2;
        }

        System.out.println("A duração total foi de " + duracao + " horas.");

        sc.close();
    }
}
