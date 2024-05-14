package br.andre.estudos.matrizes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperadorMatrizTest {

    OperadorMatriz matriz = new OperadorMatriz();

    @Test
    void somarMatrizes() {
        //testar a soma de matriz 3x3
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] resultado = matriz.somarMatrizes(matrizA, matrizB);
        int[][] esperado = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void multiplicarMatrizes() {
        //testar a multiplicação de matriz 3x3
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] resultado = matriz.multiplicarMatrizes(matrizA, matrizB);
        int[][] esperado = {{30, 24, 18}, {84, 69, 54}, {138, 114, 90}};
        assertArrayEquals(esperado, resultado);
    }
}