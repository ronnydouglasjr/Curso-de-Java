package Exercicios.Diferença;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        int total = A * B - C * D;
        System.out.printf("DIFERENCA = %d",total);
    }
}
