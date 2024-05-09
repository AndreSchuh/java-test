package br.andre.estudos.strings;

import java.util.Scanner;

import static java.lang.System.out;

public class StringProcessamento {

    public void exibeMenu(){
        Scanner sc = new Scanner(System.in);

        String texto;

        while (true) {

            String menu = """
                     \nMenu\n
                    1 - Contar letras do texto
                    2 - Texto invertido
                    4 - Texto minúsculo
                    99 - Sair 
                    Digite a opção desejada\n""";
            out.print(menu);
            int resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta) {
                case 1:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("A quantidade de caracteres é " + quantidadeCaracteres(texto));
                    break;
                case 2:
                    out.println("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto invertido fica " + inverteTexto(texto));
                    break;
                case 3:
                    out.println("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto em maiúsculo fica "+ texto.toUpperCase());
                    break;
                case 4:
                    out.println("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto em minúsculo fica "+ textoMinusculo(texto));
                    break;
                case 99:
                    out.println("Encerrando");
                    System.exit(0);
                    break;
                default:
                    out.println("Opção inválida");
            }
        }
    }

    public int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public String inverteTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    public String textoMinusculo(String texto){
        return new StringBuilder(texto).toString().toLowerCase();
    }
}
