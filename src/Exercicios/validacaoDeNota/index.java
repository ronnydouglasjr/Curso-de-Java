package Exercicios.validacaoDeNota;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = -1;
        double nota2 = -1;

       while (nota1 < 0 || nota1 > 10 ){
           nota1 = entrada.nextDouble();
           if (nota1 < 0 || nota1 > 10){
               System.out.println("nota invalida");
           }
       }

        while (nota2 < 0 || nota2 > 10 ){
            nota2 = entrada.nextDouble();
            if (nota2 < 0 || nota2 > 10){
                System.out.println("nota invalida");
            }
        }

        double resultado = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f" , + resultado);
    }
}
