package Exercicios.pares_impares_positivos_negativos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();
        int valor4 = entrada.nextInt();
        int valor5 = entrada.nextInt();

        int[] arr = {valor1, valor2, valor3, valor4, valor5};

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                pares++;
            } else{
                impares++;
            }

            if(arr[i] > 0){
                positivos++;
            } else if(arr[i] < 0) {
                negativos++;
            }
        }

        System.out.printf("%d valor(es) par(es) \n%d valor(es) impar(es) \n%d valor(es) positivo(s) \n%d valor(es) negativo(s)\n",pares,impares,positivos,negativos);
    }
}


