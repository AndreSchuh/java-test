package br.andre.estudos.matrizes;

public class MainMatrizes {

        public static void main(String[] args) {

            OperadorMatriz matriz = new OperadorMatriz();

            int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

            System.out.println("Matriz A:");
            matriz.imprimeMatriz(matrizA);
            System.out.println("---------------------");

            System.out.println("Matriz B:");
            matriz.imprimeMatriz(matrizB);
            System.out.println("====================");

            System.out.println("Somar matrizes:");
            int[][] soma = matriz.somarMatrizes(matrizA, matrizB);
            matriz.imprimeMatriz(soma);
            System.out.println("---------------------");

            System.out.println("Multiplicar matrizes:");
            int[][] multiplicacao = matriz.multiplicarMatrizes(matrizA, matrizB);
            matriz.imprimeMatriz(multiplicacao);
            System.out.println("---------------------");

        }
}
