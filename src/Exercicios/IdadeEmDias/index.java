package Exercicios.IdadeEmDias;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int diasDeVida = entrada.nextInt();


        int ano = diasDeVida / 365;
        int diasRestantes = diasDeVida - (ano * 365);
        int mes = diasRestantes / 30;
        int dias = diasRestantes - (mes * 30);

        System.out.printf("%d ano(s)\n%d mes(s)\n%d dia(s)", ano, mes, dias);

    }
}
