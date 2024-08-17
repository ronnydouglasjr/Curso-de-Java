package Exercicios.GastoDeCombustivel;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horas = entrada.nextInt();
        int velocidade = entrada.nextInt();

        double consumoDoCarro = 12.0;

        final double combustivelGasto = (horas * velocidade) / consumoDoCarro;

        System.out.printf("%.3f\n", combustivelGasto);
    }
}
