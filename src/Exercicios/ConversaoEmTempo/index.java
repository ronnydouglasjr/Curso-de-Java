package Exercicios.ConversaoEmTempo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo = entrada.nextInt();

        int segundos = tempo % 60;
        int minutos = (tempo / 60) % 60;
        int horas = (tempo / 60) / 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
