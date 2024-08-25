package Exercicios.NúmerosÍmpares;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X = entrada.nextInt();

        for (int i = 0; i < X; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
