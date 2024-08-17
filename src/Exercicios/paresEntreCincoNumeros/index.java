package Exercicios.paresEntreCincoNumeros;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();
        int valor4 = entrada.nextInt();
        int valor5 = entrada.nextInt();

        int[] numerosPares = {valor1, valor2, valor3, valor4, valor5};
        int indicePares = 0;

        for (int i = 0; i < numerosPares.length; i++) {
            if (numerosPares[i] % 2 == 0) {
                indicePares++;
            }
        }

        System.out.printf("%d valores pares\n" ,indicePares);
    }
}
