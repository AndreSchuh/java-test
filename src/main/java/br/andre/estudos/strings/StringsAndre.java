package br.andre.estudos.strings;
import java.util.Scanner;

public class StringsAndre {
    public static String palavra;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inicio = """
        \nQuantidade de caractereres!\n
        Digite uma palavra: """;

        System.out.println(inicio);
        palavra = sc.nextLine();

        System.out.printf("A quantidade de caracteres é %d", quantidade());
        //System.out.printf("A quantidade de caracteres é %d", palavra.length());

        //TODO Criar um programa que solicite ao usuário que digite uma palavra e imprima a quantidade de caracteres da palavra.
        // Criar um método (fora do main) que recebe uma palavra e retorna a quantidade de caracteres da palavra.
        // A impressão deve ser feita no main.


    }

    public static int quantidade(){
        int quantidade = palavra.length();
        return quantidade;
    }
}
