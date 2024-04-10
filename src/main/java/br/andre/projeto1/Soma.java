package br.andre.projeto1;

import java.util.Scanner;

public class Soma {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nSomando dois números inteiros!\n");

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.printf("O resultado da SOMA é: %s", (numero1 + numero2));
    }
}