package Exercicios.TempoDeUmEvento;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada[] = new String[4];

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = sc.nextLine();
        }

        String diaInicio[] = entrada[0].split(" ");
        String horaInicio[] = entrada[1].split(" : ");
        String diaFim[] = entrada[2].split(" ");
        String horaFim[] = entrada[3].split(" : ");

        int dataInicio = Integer.parseInt(diaInicio[1]);
        int horaInicial = Integer.parseInt(horaInicio[0]);
        int minutosInicial = Integer.parseInt(horaInicio[1]);
        int segundosInicial = Integer.parseInt(horaInicio[2]);

        int dataFim = Integer.parseInt(diaFim[1]);
        int horaFinal = Integer.parseInt(horaFim[0]);
        int minutosFinal = Integer.parseInt(horaFim[1]);
        int segundosFinal = Integer.parseInt(horaFim[2]);

        int segundos = segundosFinal - segundosInicial;
        if (segundos < 0) {
          segundos += 60;
          minutosFinal -= 1;
        }

        int minutos = minutosFinal - minutosInicial;
        if (minutos < 0) {
            minutos += 60;
            horaFinal -= 1;
        }

        int horas = horaFinal - horaInicial;
        if (horas < 0) {
            horas += 24;
            dataFim -= 1;
        }

        int dia = dataFim - dataInicio;

        System.out.println(dia + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }
}
