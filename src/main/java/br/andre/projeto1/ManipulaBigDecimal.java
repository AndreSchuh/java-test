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
    }

    public static void subtrair(BigDecimal a, BigDecimal b){
        //TODO implementar
    }

    public static void multiplicar(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
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
    }

    public static void baskara(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
    }
}
