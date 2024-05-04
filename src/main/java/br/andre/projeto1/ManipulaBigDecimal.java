package br.andre.projeto1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ManipulaBigDecimal {

    //constante de CLASSE para arredondamento e modo usado, serve como Default em toda a classe  :)
    private static final int SCALE = 2;
    private static final RoundingMode ROUNDING_MODE = RoundingMode.UP;
    private static final MathContext MATH_CONTEXT_32 = MathContext.DECIMAL32;

    public static void main(String[] args) {
        System.out.println("Manipulando BigDecimals");

        BigDecimal a = BigDecimal.valueOf(1);
        BigDecimal b = BigDecimal.valueOf(12);
        BigDecimal c = BigDecimal.valueOf(-13);

        soma(a, b, c);
        subtrair(a, b);
        multiplicar(a, b, c);
        dividir(b, c);
        baskara(a, b, c);
    }
    public static void soma(BigDecimal a, BigDecimal b, BigDecimal c){
        System.out.printf("O resultado da soma é %s", a.add(b).add(c));
    }

    public static void subtrair(BigDecimal a, BigDecimal b){
        System.out.printf("O resultado da subtração é %s", a.subtract(b));
    }

    public static void multiplicar(BigDecimal a, BigDecimal b, BigDecimal c){
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
        System.out.printf("O resultado da divisão é %s", b.divide(c, SCALE, ROUNDING_MODE));
    }

    public static void baskara(BigDecimal a, BigDecimal b, BigDecimal c){
//        BigDecimal delta = b.multiply(b).subtract(BigDecimal.valueOf(4.00)).multiply(a).multiply(c);
//        System.out.printf("O resultado da primeira raíz é %s", BigDecimal.valueOf(0).subtract(b).add(delta).divide(BigDecimal.valueOf(2), 3,RoundingMode.UP).multiply(a));
//        System.out.printf("O resultado da segunda raíz é %s", BigDecimal.valueOf(0).subtract(b).subtract(delta).divide(BigDecimal.valueOf(2), 3,RoundingMode.UP).multiply(a));

        //prefiro o modo 1, pois fica mais fácil de entender

        //variáveis do método, anotadas como final (para não serem alteradas)
        final BigDecimal fourDelta = BigDecimal.valueOf(4.00);
        final BigDecimal twoDivisor = BigDecimal.valueOf(2);
        //boa prática, pois sempre será usado o separador de linha do sistema operacional que está rodando (Windows, Linux, Mac, ChromeOS, etc)
        final String lineSeparator = System.lineSeparator();

        System.out.println(">Modo1");
        BigDecimal delta = b.multiply(b).subtract(fourDelta.multiply(a).multiply(c));
        System.out.println("delta = " + delta);
        BigDecimal deltaRaiz = delta.sqrt(MATH_CONTEXT_32);
        System.out.println("deltaRaiz = " + deltaRaiz);

        BigDecimal divisor = twoDivisor.multiply(a);
        System.out.println("divisor = " + divisor);


        System.out.printf("X1: %s %s", b.negate().add(deltaRaiz).divide(divisor, SCALE, ROUNDING_MODE), lineSeparator);
        System.out.printf("X2: %s%s", b.negate().subtract(deltaRaiz).divide(divisor, SCALE, ROUNDING_MODE), lineSeparator);

        //mais difícil de dar manutenção, pois é mais difícil de entender
        System.out.println(">Modo 2");
        System.out.printf("X1: %s %s", b.negate().add(b.multiply(b).subtract(fourDelta.multiply(a).multiply(c)).sqrt(MATH_CONTEXT_32)).divide(twoDivisor.multiply(a), SCALE, ROUNDING_MODE), lineSeparator);
        System.out.printf("X2: %s %s", b.negate().subtract(b.multiply(b).subtract(fourDelta.multiply(a).multiply(c)).sqrt(MATH_CONTEXT_32)).divide(twoDivisor.multiply(a), SCALE, ROUNDING_MODE), lineSeparator);
    }
}
