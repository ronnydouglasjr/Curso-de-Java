package Exercicios;

import java.util.Scanner;

public class produtoSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int PROD = num1 * num2;
        System.out.printf("PROD = %d%n", PROD);
    }
}
