package br.andre.projeto1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManipulaBigDecimal {
    public static  BigDecimal.valueOf(15.0);
        BigDecimal b = BigDecimal.valueOf(7.0);
        BigDecimal c = Bigvoid main(String[] args) {
            System.out.println("Manipulando BigDecimals");

            BigDecimal a =Decimal.valueOf(3.0);

    }

    public static void soma(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        System.out.println(a.add(b).add(c));
    }

    public static void subtrair(BigDecimal a, BigDecimal b){
        //TODO implementar
        System.out.println(a.subtract(b));
    }

    public static void multiplicar(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        System.out.println(a.multiply(b).multiply(c));
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
        System.out.println(b.divide(c, 3, RoundingMode.UP));
    }

    public static void baskara(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        BigDecimal delta = b.multiply(b).subtract(BigDecimal.valueOf(4.00)).multiply(a).multiply(c);
        System.out.println(BigDecimal.valueOf(0).subtract(b).add(delta).divide(BigDecimal.valueOf(2)).multiply(a));
        System.out.println(BigDecimal.valueOf(0).subtract(b).subtract(delta).divide(BigDecimal.valueOf(2)).multiply(a));
    }
}
