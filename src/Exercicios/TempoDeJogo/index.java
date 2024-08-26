package Exercicios.TempoDeJogo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();

        int duracaoJogo = 0;

       if (horaInicial < horaFinal) {
        duracaoJogo = horaFinal - horaInicial;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoJogo);
       } else if (horaInicial == horaFinal) {
           duracaoJogo = 24;
           System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoJogo);
       } else {
           duracaoJogo = (24 - horaInicial) + horaFinal;
           System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoJogo);
       }
    }
}
