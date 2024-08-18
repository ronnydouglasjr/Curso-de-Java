package Exercicios.Tabuada;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * N;
            System.out.printf("%d x %d = %d\n", i, N, resultado);
        }
    }
}
