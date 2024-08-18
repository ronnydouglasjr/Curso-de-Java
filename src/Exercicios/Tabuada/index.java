package Exercicios.Tabuada;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        for (int i = 0; i < N; i++) {

            double valor1 = entrada.nextDouble();
            double valor2 = entrada.nextDouble();
            double valor3 = entrada.nextDouble();

            int peso1 = 2;
            int peso2 = 3;
            int peso3 = 5;

            double somaPonderadas = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
            double mediaPonderadas = somaPonderadas / (peso1 + peso2 + peso3);
            System.out.printf("%.1f\n", mediaPonderadas);
        }
    }
}
