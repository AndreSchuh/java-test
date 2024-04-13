package br.andre.projeto1;
import java.util.Scanner;

public class Multiplica {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero2, numero1;

        System.out.println("\nMultiplicando dois números inteiros!\n");

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = sc.nextInt();

        System.out.printf("Resultado da multplicacao = %s", (numero1 * numero2));

    }
}
