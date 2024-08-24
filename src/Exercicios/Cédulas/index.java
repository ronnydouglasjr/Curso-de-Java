package Exercicios.Cédulas;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        int valor = entrada.nextInt();

        int nota100 = valor / 100;
        int nota50 = (valor % 100) / 50;
        int nota20 = (valor % 50) / 20;
        int nota10 = (valor % 100 % 50 % 20) / 10;
        int nota5 = (valor % 100 % 50 % 20 % 10) / 5;
        int nota2 = (valor % 100 % 50 % 20 % 10 % 5) / 2;
        int nota1 = (valor % 100 % 50 % 20 % 10 % 5 % 2) ;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", nota100, nota50, nota20, nota10, nota5, nota2, nota1);
    }
}
