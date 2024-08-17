package Exercicios.EntreDoisPontos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        final double distanteEntreDoisPontos = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.4f\n", distanteEntreDoisPontos);
    }
}
