package Exercicios.SomaDeImparesConsecutivos1;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X = entrada.nextInt();
        int Y = entrada.nextInt();

        int impar = 0;

        if (X > Y){
            for (int i = Y + 1; i < X; i++){
                if (i % 2 != 0){
                    impar += i;
                }
            }
        } else if (X < Y){
            for (int i = X + 1; i < Y; i++){
                if (i % 2 != 0){
                    impar += i;
                }
            }
        }

        System.out.println(impar);
    }
}
