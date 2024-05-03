package br.andre.projeto1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManipulaBigDecimal {
    public static void main(String[] args) {
        System.out.println("Manipulando BigDecimals");

        BigDecimal a = BigDecimal.valueOf(15.0);
        BigDecimal b = BigDecimal.valueOf(7.0);
        BigDecimal c = BigDecimal.valueOf(3.0);

    }
    public static void soma(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        System.out.printf("O resultado da soma é %s", a.add(b).add(c));
    }

    public static void subtrair(BigDecimal a, BigDecimal b){
        //TODO implementar
        System.out.printf("O resultado da subtração é %s", a.subtract(b));
    }

    public static void multiplicar(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        System.out.printf("O resultado da multiplicação é %s", a.multiply(b).multiply(c));
    }

    public static void dividir(BigDecimal b, BigDecimal c){
        //TODO implementar, será necessário arrendondar o resultado
        // algumas estratégias para arredondamento (brinca com cada uma com valores diferentes para entender)
        // RoundingMode.CEILING
        // RoundingMode.FLOOR
        // RoundingMode.UP
        // RoundingMode.HALF_DOWN
        // RoundingMode.HALF_UP
        // ex.: b.divide(c, 2, RoundingMode.HALF_UP);
        System.out.printf("O resultado da divisão é %s", b.divide(c, 3, RoundingMode.UP));
    }

    public static void baskara(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        BigDecimal delta = b.multiply(b).subtract(BigDecimal.valueOf(4.00)).multiply(a).multiply(c);
        System.out.printf("O resultado da primeira raíz é %s", BigDecimal.valueOf(0).subtract(b).add(delta).divide(BigDecimal.valueOf(2), 3,RoundingMode.UP).multiply(a));
        System.out.printf("O resultado da segunda raíz é %s", BigDecimal.valueOf(0).subtract(b).subtract(delta).divide(BigDecimal.valueOf(2), 3,RoundingMode.UP).multiply(a));
    }
}
