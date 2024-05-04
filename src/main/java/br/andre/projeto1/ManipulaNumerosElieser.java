package br.andre.projeto1;

import java.util.Arrays;
import java.util.Random;

public class ManipulaNumerosElieser {
    static Random random = new Random();
    static int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
            22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

    public static void main(String[] args) {

        imprimeNumerosPares(numeros);
        imprimeNumerosPrimos(numeros);
        calculaBaskara(1,12,-13);
        imprimeAleatorios(numeros, 7);
        calculaMedia(numeros, 3);
        calculaMediaGeometrica(numeros,5);

    }

    public static void imprimeNumerosPares(int[] numeros) {

        System.out.println("\nImprime números pares!\n");

        Arrays.stream(numeros).filter(n->n%2==0).forEach(System.out::println);
    }

    public static void imprimeNumerosPrimos(int[] numeros) {

        System.out.println("\n\n--------------------");
        System.out.println("\nImprime números primos!\n");

        for (int numero: numeros){
            if (isPrime(numero)){
                System.out.println(numero);
            }
        }

        //  OU
        //Arrays.stream(numeros).filter(ManipulaNumerosElieser::isPrime).forEach(System.out::println);


    }

    //método exclusivo que recebe um número e retorna um true ou false, dizendo se o número é ou não primo
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

        //OU
        // o método isProbablePrime() é mais eficiente para números grandes, o 100 é a precisão, nesse caso 100% preciso.
        // return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(100);

    }

    public static void calculaBaskara(int a, int b, int c) {

        System.out.println("\n\n--------------------");
        System.out.printf("\nCalcula Baskara de a=%d, b=%d e c=%d!\n", a,b,c);

        double delta = Math.sqrt(b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Não há raízes reais");
        } else if (delta == 0) {
            double x = (double) -b / (2 * a);
            System.out.println("Raiz única: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Raízes: %.4f e %.4f", x1, x2);
        }
    }

    public static void imprimeAleatorios(int[] numeros, int quantidade) {

        System.out.println("\n\n--------------------");
        System.out.printf("\nImprime %d números aleatórios!\n", quantidade);

        for (int i = 0; i < quantidade; i++) {
            System.out.println(numeros[random.nextInt(numeros.length)]);
        }
        //OU
        //Arrays.stream(numeros).map(n -> random.nextInt(numeros.length)).limit(quantidade).forEach(System.out::println);
    }

    public static void calculaMedia(int[] numeros, int quantidade) {

        System.out.println("\n\n--------------------");
        System.out.println("\nCalcula média!\n");

        int[] selecionados = Arrays.stream(numeros).map(n -> random.nextInt(numeros.length)).limit(quantidade).toArray();

        System.out.println("Números selecionados:");
        Arrays.stream(selecionados).forEach(System.out::println);

        Arrays.stream(selecionados).reduce(Integer::sum).ifPresent(num -> System.out.printf("Média: %.4f", (double)(num / quantidade)));

    }

    public static void calculaMediaGeometrica(int[] numeros, int quantidade) {
        System.out.println("\n\n--------------------");
        System.out.printf("\nCalcula média geométrica de %d números!\n", quantidade);

        int[] selecionados = Arrays.stream(numeros).map(n -> random.nextInt(numeros.length)).limit(quantidade).toArray();
        System.out.println("Números selecionados:");
        Arrays.stream(selecionados).forEach(System.out::println);
        double product = 1.0;
        for (int num : selecionados) {
            product *= num;
        }
//        ESSE
//        double geometricMean = Math.pow(product, 1.0 / selecionados.length);
//        System.out.println("Media geométrica: " + geometricMean);
//        OU
        double geometricMean = product;
        for (int i = 0; i < quantidade; i++) {
            geometricMean = Math.sqrt(geometricMean);
        }
        System.out.printf("Media geométrica: %.4f ", geometricMean);
    }
}
