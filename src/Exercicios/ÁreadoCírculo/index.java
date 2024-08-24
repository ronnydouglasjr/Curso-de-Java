package Exercicios.ÁreadoCírculo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        double raio = entrada.nextDouble();
        double n = 3.14159;

        double area = n * Math.pow(raio, 2);
        System.out.printf("Area = %.4f", area);
    }
}
