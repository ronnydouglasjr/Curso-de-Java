package Exercicios.Lanche;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();

        double preco = 0.0;

        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
            default:
        }

        final double total = preco * quantidade;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
