package Exercicios.Média1;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();

        double peso1 = 3.5;
        double peso2 = 7.5;

        double SomaNotas = (peso1 * nota1) + (peso2 * nota2);
        double media = SomaNotas / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
