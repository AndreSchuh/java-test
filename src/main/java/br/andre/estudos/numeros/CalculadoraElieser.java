package br.andre.estudos.numeros;

import java.util.Scanner;

public class CalculadoraElieser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculadora!\n");

        while (true) {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("99 - SAIR");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O resultado da SOMA é: %s", somar(numero1, numero2));
                    break;
                case 2:
                    System.out.printf("O resultado da SUBTRAÇÃO é: %s", subtrair(numero1, numero2));
                    break;
                case 3:
                    System.out.printf("O resultado da MULTIPLICAÇÃO é: %s", multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.printf("O resultado da DIVISÃO é: %s", dividir(numero1, numero2));
                    break;
                case 99:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public  static double subtrair(double a, double b) {
        return a - b;
    }

    public  static double multiplicar(double a, double b) {
        return a * b;
    }

    public  static double dividir(double a, double b) {
        return a / b;
    }
}
