package Exercicios.numerosPositivos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        double valor3 = entrada.nextDouble();
        double valor4 = entrada.nextDouble();
        double valor5 = entrada.nextDouble();
        double valor6 = entrada.nextDouble();

        double[] arr = {valor1,valor2,valor3,valor4,valor5,valor6};
        int indice = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 0)){
                indice++;
            }
        }

        System.out.printf("%d valores positivos\n", indice);
    }
}
