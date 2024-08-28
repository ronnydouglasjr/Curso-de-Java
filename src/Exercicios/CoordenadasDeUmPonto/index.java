package Exercicios.CoordenadasDeUmPonto;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        double X = entrada.nextDouble();
        double Y = entrada.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }
    }
}
