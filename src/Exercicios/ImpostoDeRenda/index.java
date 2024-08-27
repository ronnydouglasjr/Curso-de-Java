package Exercicios.ImpostoDeRenda;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double renda = entrada.nextDouble();
        double impostoRenda = 0.0;

        if ( renda <= 2000.00) {
            System.out.println("Isento");
        } else if(renda <= 3000.00) {
            impostoRenda = (renda  - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", impostoRenda);
        } else if(renda <= 4500.00) {
            impostoRenda = 1000.00 * 0.08;
            impostoRenda += (renda - 3000.00) * 0.18;
            System.out.printf("R$ %.2f\n", impostoRenda);
        } else if (renda > 4500.00) {
            impostoRenda = 1000.00 * 0.08;
            impostoRenda += 1500.00 * 0.18;
            impostoRenda += (renda - 4500.00) * 0.28;
            System.out.printf("R$ %.2f\n", impostoRenda);
        }
    }
}
