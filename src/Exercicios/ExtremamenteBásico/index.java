package Exercicios.ExtremamenteBásico;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();

        int X = A + B;
        System.out.printf("X = %d", X);
    }
}
