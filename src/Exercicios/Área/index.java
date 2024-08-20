package Exercicios.Área;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double areaDoTriangulo = A * C / 2;
        double areaDoCirculo = 3.14159 * C * C;
        double areaDoTrapezio = (A + B) * C / 2;
        double areaDoQuadrado = B * B;
        double areaDoRetangulo = A * B;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n" ,areaDoTriangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo);
    }
}
