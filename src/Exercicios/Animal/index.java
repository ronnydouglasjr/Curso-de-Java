package Exercicios.Animal;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao = entrada.nextLine();
        String opcao2 = "";
        String opcao3 = "";

        if (opcao.equals("vertebrado")) {
            opcao2 = entrada.nextLine();
            if (opcao2.equals("ave")) {
                opcao3 = entrada.nextLine();
                if (opcao3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if(opcao3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (opcao2.equals("mamifero")) {
                opcao2 = entrada.nextLine();
                if (opcao2.equals("onivoro")) {
                    System.out.println("homem");
                } else if(opcao2.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (opcao.equals("invertebrado")) {
            opcao2 = entrada.nextLine();
            if (opcao2.equals("inseto")) {
                opcao3 = entrada.nextLine();
                if (opcao3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (opcao3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (opcao2.equals("anelideo")) {
                opcao3 = entrada.nextLine();
                if (opcao3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (opcao3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
