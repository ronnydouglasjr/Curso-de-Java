package Exercicios.Média3;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();

        int p1 = 2;
        int p2 = 3;
        int p3 = 4;
        int p4 = 1;

        double somaDasNotas = (n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4);
        int pesosDaNota = p1 + p2 + p3 + p4;

        double media = somaDasNotas / pesosDaNota;
        media = Math.floor(media * 10.0) / 10.0;

        if (media >= 7.0){
            System.out.printf("Media: %.1f\nAluno aprovado.\n", media);
        } else {
            if (media >= 5.0){
                System.out.printf("Media: %.1f\nAluno em exame.\n", media);
                double notaExame = entrada.nextDouble();
                media = (media + notaExame) / 2;
                if (media >= 5.0){
                    System.out.printf("Nota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n",notaExame, media);
                } else {
                    System.out.printf("Aluno Reprovado.\nMedia final: %.1f\n", media);
                }
            } else {
                System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
            }
        }
    }
}
