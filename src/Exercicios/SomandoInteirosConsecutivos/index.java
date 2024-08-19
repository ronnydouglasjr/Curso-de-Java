package Exercicios.SomandoInteirosConsecutivos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int N = entrada.nextInt();

        while( N <= 0){
            N = entrada.nextInt();
        }

        int totol = 0;
        for (int i = 0; i < N; i++) {
            totol += A + i;
        }

        System.out.println(totol);
    }
}
