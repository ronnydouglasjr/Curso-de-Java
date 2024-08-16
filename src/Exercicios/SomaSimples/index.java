package Exercicios.SomaSimples;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number1 = entrada.nextInt();
        int number2 = entrada.nextInt();

        int soma = number1 + number2;

        System.out.printf("SOMA = %d", soma);
    }
}
