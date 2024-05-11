package br.andre.estudos.strings;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class StringProcessamento {

    public void exibeMenu() {
        Scanner sc = new Scanner(System.in);

        String texto;
        int posicaoTexto;

        while (true) {

            String menu = """
                     \nMenu\n
                    1 - Contar letras do texto
                    2 - Texto invertido
                    3 - Texto maiúsculo
                    4 - Texto minúsculo
                    5 - Primeira letra maiúscula no texto
                    6 - Texto palíndromo
                    7 - Quantidade de palavras no texto
                    8 - Remover espaços antes e depois do texto
                    9 - Imprimir caractere de uma posição
                    10 - Imprimir texto até uma posição
                    11 - Substituir caractere
                    12 - Remover caractere                
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
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto invertido fica " + inverteTexto(texto));
                    break;
                case 3:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto em maiúsculo fica " + textoMaiusculo(texto));
                    break;
                case 4:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto em minúsculo fica " + textoMinusculo(texto));
                    break;
                case 5:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println("O texto com a primeira letra maiúscula fica " + upperCaseFirst(texto));
                    break;
                case 6:
                    out.println("Digite um texto:");
                    texto = sc.nextLine();
                    String resultado = textoPalindromo(texto) ? "é palíndromo" : "não é palíndromo";
                    out.printf("O texto " + resultado);
                    break;
                case 7:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();

                    if (quantidadePalavra(texto) > 1) {
                        String s = "O texto tem " + quantidadePalavra(texto) + " palavra(s)";
                        out.print(s);
                    } else {
                        String s = "O texto tem " + quantidadePalavra(texto) + " palavra";
                        out.print(s);
                    }
                    break;
                case 8:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.println(textoSemEspaco(texto));
                    break;
                case 9:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.print("Digite a posição do caractere:");
                    posicaoTexto = sc.nextInt();
                    out.println("O seu caractere é " + caractereDePosicao(texto, posicaoTexto));
                    break;
                case 10:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.print("Digite até qual posição você deseja imprimir esse texto:");
                    posicaoTexto = sc.nextInt();
                    out.println(printAteposicao(texto, posicaoTexto));
                    break;
                case 11:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.print("Digite o caractere que deseja substituir:");
                    String caracterSubstituir = sc.nextLine();
                    out.print("Digite o caractere que deseja inserir:");
                    String caracterInserir = sc.nextLine();
                    out.println(trocaPosicaoCaractere(texto, caracterSubstituir, caracterInserir));
                    break;
                case 12:
                    out.print("Digite um texto:");
                    texto = sc.nextLine();
                    out.print("Digite o caractere que deseja remover:");
                    String caracterRemover = sc.nextLine();
                    out.println(removeCaractereTexto(texto, caracterRemover));
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

    public String textoMinusculo(String texto) {
        return new StringBuilder(texto).toString().toLowerCase();
    }

    public String textoMaiusculo(String texto) {
        return new StringBuilder(texto).toString().toUpperCase();
    }

    public String upperCaseFirst(String texto) {
        String[] palavras = texto.split(" ");
        StringBuilder textoCapitalizado = new StringBuilder();

        for (String palavra : palavras) {
            String primeiraLetra = palavra.substring(0, 1);
            String restoDaPalavra = palavra.substring(1);
            textoCapitalizado.append(primeiraLetra.toUpperCase()).append(restoDaPalavra).append(" ");
        }
        return textoCapitalizado.toString().trim();
    }

    public boolean textoPalindromo(String texto) {
        return texto.equalsIgnoreCase(new StringBuilder(texto).reverse().toString());
    }

    public int quantidadePalavra(String texto) {
        String[] quantidadeTexto = texto.split(" ");
        return quantidadeTexto.length;
    }

    public String textoSemEspaco(String texto) {
        return  texto.trim();
    }

    public char caractereDePosicao(String texto, int posicaoTexto) {
        return texto.charAt(posicaoTexto);
    }

    public String printAteposicao(String texto, int posicaoTexto) {
        String resultado;
        if(posicaoTexto <= texto.length()){
            resultado = texto.substring(0, posicaoTexto);
        }else{
            resultado = ("opção inválida");
        }
        return resultado;
    }

    public String trocaPosicaoCaractere(String texto, String caracterSubstituir, String caracterInserir){
        return texto.replace(caracterSubstituir, caracterInserir);
    }

    public String removeCaractereTexto(String texto, String caracterRemover){
        String textoCaracterRemovido = texto.replace(caracterRemover, "");
        return textoCaracterRemovido;
    }
}