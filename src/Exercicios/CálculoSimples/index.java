package Exercicios.CálculoSimples;
import java.util.Scanner;


public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo1 = entrada.nextInt();
        int numeropecas1 = entrada.nextInt();
        double valorUnitario1 = entrada.nextDouble();

        int codigo2 = entrada.nextInt();
        int numeropecas2 = entrada.nextInt();
        double valorUnitario2 = entrada.nextDouble();

        double valorTotal = (numeropecas1 * valorUnitario1) + (numeropecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
