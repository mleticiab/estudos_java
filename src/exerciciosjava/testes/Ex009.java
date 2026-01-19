package exerciciosjava.testes;

import java.util.Scanner;

    public class Ex009 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;
            int opc;

            do {
                System.out.println("Digite um número: ");
                n = sc.nextInt();

                if (n > 0) {
                    System.out.printf("O número %d é POSITIVO.", n);
                } else if (n < 0) {
                    System.out.printf("O número %d é NEGATIVO.", n);
                } else {
                    System.out.println("O número é ZERO.");
                }

                System.out.println("Deseja continuar?");
                System.out.println("Sim - 1");
                System.out.println("Sair - 0");
                System.out.print("Opção: ");
                opc = sc.nextInt();

            } while (opc == 1);

            System.out.println("Encerrado.");
            sc.close();
        }
    }
