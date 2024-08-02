package br.andre.estudos.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StreamsBigDecimalExemplo {
    public static void main(String[] args) {
        Set<BigDecimal> numeros = geraSetComBigDecimal(10);
        imprimeSetComNumeros(numeros);
        calculaSoma(numeros);
        imprimeNumerosAcima50(numeros);
        numeros0a50comDesconto20PorCento(numeros);
        numeros30a60comDesconto30PorCento(numeros);
        numeros50a100comDesconto35PorCento(numeros);
        somaNumeros1QuartilE3Quartil(numeros);
        imprimeNumeros2Quartil(numeros);
    }

    private static Set<BigDecimal> geraSetComBigDecimal(int limit) {
        Set<BigDecimal> numeros = new HashSet<>();
        Random random = new Random();
        for(int i =0; i< limit; i++) {
            numeros.add(BigDecimal.valueOf(random.nextDouble(100)).setScale(2, RoundingMode.HALF_UP));
        }
        return numeros;
    }

    private static void imprimeSetComNumeros(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Imprimindo set com números");

        System.out.println(numeros);

    }

    private static void calculaSoma(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("A soma dos números é: ");

    }

    private static void imprimeNumerosAcima50(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Números acima de 50 são: ");


    }

    private static void numeros0a50comDesconto20PorCento(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Números 0 a 50 com 20% de desconto: ");


    }

    private static void numeros30a60comDesconto30PorCento(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Números 30 a 60 com 30% de desconto: ");


    }

    private static void numeros50a100comDesconto35PorCento(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Números 50 a 100 com 35% de desconto: ");


    }

    private static void somaNumeros1QuartilE3Quartil(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Soma dos números do 1º e 3º quartis: ");


    }

    private static void imprimeNumeros2Quartil(Set<BigDecimal> numeros){
        System.out.println("-----------------------------------");
        System.out.println("Imprime os números do 2º quartil: ");


    }
}
