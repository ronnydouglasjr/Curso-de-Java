package Exercicios.Crescente_E_Decrescente;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
             int X = entrada.nextInt();
             int Y = entrada.nextInt();

             if(X > Y){
                 System.out.println("Decrescente");
             } else if(X < Y){
                 System.out.println("Crescente");
            } else  if(X == Y)  {
                break;
            }
        }
    }
}
