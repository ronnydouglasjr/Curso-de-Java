package Aulas;

public class aula01 {
    public static void main(String[] args) {
        // Tipos de numeros inteiros
        byte anosDeEmpresa = 23;
        short numerosDevoos = 542;
        int id = 56789;
        long pontosOcumulados = 3_134_845_223L;

        // Tipos de numeros reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipos booleano
        boolean estaDeFerias = true;

        // tipo caractere
        char status = 'a';

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numeros de viagens
        System.out.println(numerosDevoos / 2);

        // pontos para real
        System.out.println(pontosOcumulados / vendasAcumuladas);

        System.out.println(id + " ganha -> " + salario);
        System.out.println("Ferias = " +  estaDeFerias );

    }
}

