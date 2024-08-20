package Exercicios.SalárioComBonus;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        double salarioFixo = entrada.nextDouble();
        double vendasRealizada = entrada.nextDouble();

        double bonusVendas =  ((double) 15 / 100) * vendasRealizada;
        double salarioLiquido = salarioFixo + bonusVendas;

        System.out.printf("TOTAL = R$ %.2f\n", salarioLiquido);
    }
}