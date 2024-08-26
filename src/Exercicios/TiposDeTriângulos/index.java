package Exercicios.TiposDeTriângulos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        Double[] arr = {A,B,C};
        Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.stream(arr).forEach(System.out::println);

        A = arr[0];
        B = arr[1];
        C = arr[2];

        if (A >= B + C){
           System.out.println("NAO FORMA TRIANGULO");
        } else if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)){
            System.out.println("TRIANGULO RETANGULO");
        }

        if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && A == C && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
