package Exercicios.SortSimples;

import java.util.Arrays;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();

        int[] arr = {valor1, valor2, valor3};
        int[] newArr = {valor1, valor2, valor3};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\n", arr[i]);
        }

        System.out.println();

        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d\n", newArr[i]);
        }
    }
}
