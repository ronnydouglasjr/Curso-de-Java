package Exercicios.Esfera;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int raio = entrada.nextInt();
        double PI = 3.14159;

        double esfera = (4.0/3) * PI * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", esfera);
    }
}
