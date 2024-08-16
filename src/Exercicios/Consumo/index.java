package Exercicios.Consumo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        int X = entrada.nextInt();
        double Y = entrada.nextDouble();

        double consumoMedio = X / Y;
        System.out.printf("%.3f km/l", consumoMedio);
    }
}
