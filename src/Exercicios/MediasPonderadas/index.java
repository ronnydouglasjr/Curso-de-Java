package Exercicios.MediasPonderadas;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        int peso = entrada.nextInt();

        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        double valor3 = entrada.nextDouble();


        double somaDasnotas = (valor1 * peso)+ (valor2 * peso) + (valor3 * peso);
        double mediaPonderadas = somaDasnotas / (valor1 * valor2 * valor3);
        System.out.printf("%.1f\n", mediaPonderadas);
    }
}
