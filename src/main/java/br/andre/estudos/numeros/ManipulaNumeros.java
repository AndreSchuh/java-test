package br.andre.estudos.numeros;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaNumeros {
    static Scanner scanner = new Scanner(System.in);
    static Random gerador = new Random();
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
                22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        imprimeNumerosPares(numeros);
        imprimeNumerosPrimos(numeros);
        calculaBaskara(1,12,-13);
        imprimeAleatorios(numeros, 7);
        calculaMedia(numeros, 5);

    }

    public static void imprimeNumerosPares(int[] numeros) {

        //Só faltou imprimir o número que é par, e era pra imprimir só os pares mesmo, conforme o nome do método
        System.out.println("\nNúmeros pares!\n");
        Arrays.stream(numeros).filter(n -> n % 2 ==0).forEach(System.out::println);

        //Pega a sacada: impressão de números pares usando Stream (Stream é uma forma de manipular coleções de dados)
        //Veja como é possível fazer em uma única linha....
        //Arrays.stream(numeros).filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    public static void imprimeNumerosPrimos(int[] numeros) {
        // TODO implementar
        // Dei uma pesquisada vou precisar de mais tempo pra resolver esse

        // É uma lógica simples, primo é aquele que só divide por um e por ele mesmo, ou seja
        // se numero % 1 == 0 e numero % numero == 0 E qualquer numero entre 1 e ele mesmo não der resto 0
        // cai muito em prova de programação
        Arrays.stream(numeros).filter(n -> n % 1 ==0).forEach(System.out::println);
        Arrays.stream(numeros).filter(n -> n % n ==0).forEach(System.out::println);

        //if( numeros % 1 == 0 || numeros % numeros == 0){
        //      System.out.println(numeros);
        //}
        }

    public static void calculaBaskara(int a, int b, int c) {

        // Era pra declarar os números assim?
        //Não exatamente aqui dentro, pois vc tem as três variáveis como parâmetros na assinatua do método, então lá
        //dentro do método "main" vc declara as variáveis e chama o calculaBaskara(3, 6, 25). Deixei comentado lá em cima, só tirar o comentário

        // o "+-" da forma que vc colocou sempre vai ser menos (mais com menos = menos)
        //Dica, quebrar em partes:
        //Sugiro primeiro calcular o Delta e associar a uma variável
        //A operação de segundo grau espera dois números, então a dica é realizar operação de raiz quadrada separadamente,
        //e na hora de imprimir pensa em algo do tipo: " As raizes são x1 = "val" e x2 = "val" "
        calculaBaskara(3, 6, 25);
        double delta = Math.sqrt((b*b) - 4 * a * c);
        double resultado1 = -b + delta/ (2 * a);
        double resultado2 = -b - delta/ (2 * a);
        System.out.printf("As raízes são x1 = %.2f e x2 %.2f", resultado2, resultado2);
    }

    public static void imprimeAleatorios(int[] numeros, int quantidade) {
        // TODO implementar, onde quantidade deve ser quantos números aleatórios do array numeros devem ser impressos
        System.out.println("\nAleatório!\n");

        //a quantidade não pode receber um valor aqui dentro do método, ela é um parâmetro do método
        //e representa a quantidade de números aleatórios que vc quer imprimir
        //Dica: tu vai precisar de um for de 0 até a quantidade (recebido no parâmetro), e dentro do for vc vai
        //mandar imprimir: gerador.nextInt(numeros.length). Isso vai gerar um número aleatório entre 0 e o tamanho do array
        for (int i = 0; quantidade <= 7; i++) {
            quantidade = quantidade +1;
            System.out.println(gerador.nextInt(numeros.length));
        }
    }
    public static void calculaMedia(int[] numeros, int quantidade) {
        /*
        Explicando melhor:
        Você tem um array de 40 números lá no "main" e esse método recebe o array e a quantidade de números que você quer gerar média.
        O método deve escolher aleatoriamente a quantidade de números que você passou no parâmetro e gerar a média deles.
        Deve ser impresso os números aleatórios e a média deles.
        É parecido com o de cima, conforme vc escolher o numero aleatório, vc imprime ele e vai somando em uma variável
        Depois de imprimir todos, fora do "for" vc divide a variável acumulada pela quantidade de números e apresenta a média.
         */
        // quantidade de números aleatórios do array "numeros"
        // deve imprimir os números aleatórios e em seguida a média deles
        for (int i = 0; quantidade <= 5; i++) {
            quantidade = quantidade +1;
            System.out.println(gerador.nextInt(numeros.length));
        }
        int ger = numeros.length;
        int resultado = ger / quantidade;

        System.out.printf("A média fica %.2f", resultado);
    }
}
