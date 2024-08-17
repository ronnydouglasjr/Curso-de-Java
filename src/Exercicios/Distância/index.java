package Exercicios.Distância;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X = entrada.nextInt();
        int distancia = X * 2;

        System.out.printf("%d minutos\n", distancia);
    }
}
