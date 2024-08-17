package Exercicios.SeisNumerosImpares;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X = entrada.nextInt();

        for (int i = X; i < X + 12; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
