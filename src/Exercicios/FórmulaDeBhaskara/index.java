package Exercicios.FórmulaDeBhaskara;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double delta = B * B - 4 * A * C;

        if(delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
        } else {
            double resultado = Math.sqrt(delta);
            double r1 = (-B + resultado) / (2 * A);
            double r2 = (-B - resultado) / (2 * A);

            System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
        }
    }
}
