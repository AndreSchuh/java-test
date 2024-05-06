package br.andre.estudos.strings;
import java.util.Scanner;

public class StringsAndre {
    public  static String palavra;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true) {

            String menu = """
                     \nQuantidade de caractereres!\n
                    1 - Contar letras do texto
                    99 - Sair 
                    Digite a opção desejada\n""";
            System.out.print(menu);
            int resposta = sc.nextInt();
            sc.nextLine();

            switch(resposta){
                case 1:
            System.out.println("Digite uma palavra:");
            palavra = sc.nextLine();
            System.out.println("A quantidade de caracteres é "+ quantidade(palavra));
            break;

                case 99:
                    System.out.println("Encerrando");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        //TODO Criar um programa que solicite ao usuário que digite uma palavra e imprima a quantidade de caracteres da palavra.
        // Criar um método (fora do main) que recebe uma palavra e retorna a quantidade de caracteres da palavra.
        // A impressão deve ser feita no main.

    }

    public static int quantidade(String letra){
        return letra.length();
    }
}
