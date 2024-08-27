package Exercicios.AumentoDeSalário;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();

        double reajusteSalario = 0;
        int percentual = 0;
        double novoSalario = 0;

        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
            reajusteSalario = (percentual /100.0) * salario;
            novoSalario = salario + reajusteSalario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajusteSalario, percentual);
        } else if (salario > 400.00 && salario <= 800.00) {
            percentual = 12;
            reajusteSalario = (percentual /100.0) * salario;
            novoSalario = salario + reajusteSalario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajusteSalario, percentual);
        } else if (salario > 800.00 && salario <= 1200.00) {
            percentual = 10;
            reajusteSalario = (percentual /100.0) * salario;
            novoSalario = salario + reajusteSalario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajusteSalario, percentual);
        } else if (salario > 1200.00 && salario <= 2000.00) {
            percentual = 7;
            reajusteSalario = (percentual /100.0) * salario;
            novoSalario = salario + reajusteSalario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajusteSalario, percentual);
        } else if (salario > 2000.00) {
            percentual = 4;
            reajusteSalario = (percentual /100.0) * salario;
            novoSalario = salario + reajusteSalario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajusteSalario, percentual);
        }
    }
}
