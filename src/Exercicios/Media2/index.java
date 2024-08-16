package Exercicios.Media2;

import java.util.Scanner;

public class index {

    public static void main(String[] args)  {


        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;


        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);


        System.out.printf("MEDIA = %.1f%n", media);

    }
}
