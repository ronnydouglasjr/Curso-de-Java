package Exercicios.Intervalo2;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            int X = entrada.nextInt();

            if( X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out\n", in, out);
    }
}
