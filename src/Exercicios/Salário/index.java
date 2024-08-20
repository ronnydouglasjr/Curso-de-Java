package Exercicios.Salário;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDoFuncionario = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double salarioPorHora = entrada.nextDouble();

        double salario = salarioPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numeroDoFuncionario, salario);
    }
}
