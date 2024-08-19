package Exercicios.SenhaFixa;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int senhaCorreta = 2002;

        while (true) {
            int senha = entrada.nextInt();

            if (senha == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
