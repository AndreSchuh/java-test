package br.andre.projeto1;
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static double numero1, numero2, resultado;

    public static void main(String[] args) {
        int operacao;

        System.out.println("\nCalculadora!\n");

        do {
            System.out.println("Digite o primeiro número:");
            numero1 = sc.nextDouble();

            System.out.println("Digite o segundo número:");
            numero2 = sc.nextDouble();

            System.out.println("Escolha a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("99 - Sair");
            operacao = sc.nextInt();

            if(1 == operacao){
               resultado = soma();
               System.out.println(""+ resultado);
            }else if(2 == operacao){
                resultado = subtracao();
                System.out.println(""+ resultado);
            }else if(3 == operacao){
                resultado = multiplicacao();
                System.out.println(""+ resultado);
            }else if(4 == operacao){
                resultado = divisao();
                System.out.println(""+ resultado);
            }
        } while (operacao >= 1 && operacao <= 4);
    }

    public static double soma() {
        resultado = numero1 + numero2;
        return resultado;
    }
    public static double subtracao() {
        resultado = numero1 - numero2;
        return resultado;
    }
    public static double multiplicacao() {
        resultado = numero1 * numero2;
        return resultado;
    }
    public static double divisao() {
        resultado = numero1 / numero2;
        return resultado;
    }
}
