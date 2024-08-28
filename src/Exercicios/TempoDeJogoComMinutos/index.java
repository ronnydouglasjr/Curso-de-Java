package Exercicios.TempoDeJogoComMinutos;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] valores = entrada.split(" ");

        int horaIincio = Integer.parseInt(valores[0]);
        int minutoIincio = Integer.parseInt(valores[1]);
        int horaFim = Integer.parseInt(valores[2]);
        int minutoFim = Integer.parseInt(valores[3]);

        int minutos_iniciais = horaIincio * 60 + minutoIincio;
        int minutos_final = horaFim * 60 + minutoFim;

        if (minutos_final < minutos_iniciais){
            minutos_final += 1440;

        }

        int duracao = minutos_final - minutos_iniciais;
        int duracao_horas = duracao / 60;
        int duracao_minutos = duracao % 60;

        if(duracao_horas == 0 && duracao_minutos == 0){
            duracao_horas += 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracao_horas, duracao_minutos);
    }
}
