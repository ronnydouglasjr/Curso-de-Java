package Exercicios.SomaImparesConsecutivos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        int N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            int X = entrada.nextInt();
            int Y = entrada.nextInt();

            int min = Math.min(X, Y);
            int max = Math.max(X, Y);

            int total = 0;

            for (int j = min + 1; j < max; j++) {
                if (j % 2 != 0) {
                    total += j;
                }
            }

            System.out.println(total);
        }
    }
}
