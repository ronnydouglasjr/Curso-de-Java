package Exercicios.Quadrante;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {
            int X = entrada.nextInt();
            int Y = entrada.nextInt();

            if(X == 0 || Y == 0) {
                break;
            }

            if(X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if(X > 0 && Y < 0) {
                System.out.println("quarto");
            } else if (X < 0 && Y < 0 && X < Y) {
                System.out.println("terceiro");
            } else {
                System.out.println("segundo");
            }
        }
    }
}
