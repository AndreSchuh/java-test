package br.andre.projeto1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaNumeros {
    static Scanner scanner = new Scanner(System.in);
    static Random gerador = new Random();
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
                22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

    }

    public static void imprimeNumerosPares(int[] numeros) {
        // TODO implementar
        System.out.println("\nNúmero par ou ímpar!\n");
        for ( int numero : numeros){ // Essa parte de Enhanced for loop eu tive que pesquisar
            if(numero % 2 == 0){
                System.out.println("Número par");
            }else{
                System.out.println("Número ímpar");
            }
        }
    }

    public static void imprimeNumerosPrimos(int[] numeros) {
        // TODO implementar
        // Dei uma pesquisada vou precisar de mais tempo pra resolver esse
    }

    public static void calculaBaskara(int a, int b, int c) {
        // TODO implementar, recebe quaisquer 3 números fixos
        a = 3; // Era pra declarar os números assim?
        b = 6;
        c = 25;
        double resultado = -b +- Math.sqrt((b*b) - 4 * a * c)/ 2 * a;
        System.out.printf("Resultado = %.2f" + resultado);
    }

    public static void imprimeAleatorios(int[] numeros, int quantidade) {
        // TODO implementar, onde quantidade deve ser quantos números aleatórios do array numeros devem ser impressos
        System.out.println("\nAleatório!\n");

        quantidade = gerador.nextInt(numeros.length);

        int numeroAleatorio = numeros[quantidade];
        System.out.printf("Número aleatório da array = " + numeroAleatorio);
        }

    public static void calculaMedia(int[] numeros, int quantidade) {
        // TODO implementar
        // quantidade de números aleatórios do array "numeros"
        // deve imprimir os números aleatórios e em seguida a média deles
        quantidade = gerador.nextInt(numeros.length);
        int numeroAleatorio = numeros[quantidade];

        System.out.printf("Número aleatório da array = " + numeroAleatorio);

        int a = (numeroAleatorio.length); // Tive a ideia de usar a length porém ...
    }

    public static void calculaMediaGeometrica(int[] numeros, int quantidade) {
        // TODO implementar
        // quantidade de números aleatórios do array "numeros"
        // deve imprimir os números aleatórios e em seguida a média geométrica deles
        // Esse daqui eu nem tentei, estava tentando resolver os outros primeiros
    }
}
