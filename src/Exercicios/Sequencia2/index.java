package Exercicios.Sequencia2;

public class index {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i+=2 ) {
            for (int j = 7; j <= 15; j-- ) {
                System.out.printf("I=%d J=%d\n", i, j);
                if (j == 5 || j == 7 || j ==  12){
                    j += 5;
                }
            }
        }
    }
}
