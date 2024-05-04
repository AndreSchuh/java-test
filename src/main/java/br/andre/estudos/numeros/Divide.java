package br.andre.estudos.numeros;
import java.util.Scanner;

public class Divide {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        float numero2, numero1, resultado;

        System.out.println("\nDividindo dois números!\n");

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = sc.nextInt();

        resultado = numero1 / numero2;
        System.out.printf("Resultado da divisao = %.2f", resultado);
    }
}
