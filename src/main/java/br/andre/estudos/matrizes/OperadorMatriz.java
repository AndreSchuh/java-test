package br.andre.estudos.matrizes;

public class OperadorMatriz {
    private java.lang.StringBuilder StringBuilder;

    public void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
    }

    public int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length) {
            System.out.println("Matrizes incompatíveis");
            return null;
        }

        int[][] matrizSoma = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizSoma;
    }

    public int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length) {
            System.out.println("Matrizes incompatíveis");
            return null;
        }

        int[][] matrizMultiplicacao = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                int somaMatrizMultiplicacao = 0;
                for (int k = 0; k < matrizA[0].length; k++) {
                    somaMatrizMultiplicacao += matrizA[i][k] * matrizB[k][j];
                }
                matrizMultiplicacao[i][j] = somaMatrizMultiplicacao;
            }
        }
        return matrizMultiplicacao;
        }
    }