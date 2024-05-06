package br.andre.estudos.numeros;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManipulaBigDecimalElieser {
    public static void main(String[] args) {
        System.out.println("Manipulando BigDecimals!\n");

        //Para instanciar um BigDecimal, pode ser feito com  .valueOf ou com new BigDecimal(num)
        BigDecimal a = BigDecimal.valueOf(15.2);
        BigDecimal b = BigDecimal.valueOf(7.1);
        BigDecimal c = BigDecimal.valueOf(3.3);

        soma(a,b,c);
        subtrair(a,b);
        multiplicar(a,b,c);
        dividir(b,c);
        //aqui usei os mesmos números do exemplo anterior, dai fica melhor pra ti comparar os resultados e garantir
        //que a conta esteja correta
        baskara(BigDecimal.valueOf(1), BigDecimal.valueOf(12), BigDecimal.valueOf(-13));

    }

    public static void soma(BigDecimal a, BigDecimal b, BigDecimal c){
        System.out.printf("O resultado da soma é: %s\n", a.add(b).add(c));
    }

    public static void subtrair(BigDecimal a, BigDecimal b){
        //TODO implementar
        //usar o .subtract
    }

    public static void multiplicar(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        //usar o .multiply
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
        System.out.printf("O resultado da divisão é: %s\n", b.divide(c, 2, RoundingMode.HALF_UP));
    }

    public static void baskara(BigDecimal a, BigDecimal b, BigDecimal c){
        //TODO implementar
        //DESAFIO
    }
}
