package br.andre.estudos.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuDesafioMaps {


    public static void main(String[] args) {

    Map<String, Double> notas = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        MapsManipulator mapsManipulator = new MapsManipulator();

        String nomeAluno = "";
        Double notaAluno = 0.0;
        int opcaoUser = 0;

        while (true) {
            if (opcaoUser != 3) {mapsManipulator.exibeMapa(notas);}
            System.out.println("-------------------------");
            System.out.println("Notas dos alunos");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Remover nota");
            System.out.println("3 - Listar todas as notas");
            System.out.println("4 - Somar todas as notas");
            System.out.println("5 - Média de todas as notas");
            System.out.println("6 - Aluno e nota máxima");
            System.out.println("7 - Aluno e nota mínima");
            System.out.println("99 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcaoUser = scanner.nextInt();

            switch (opcaoUser) {
                case 99:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("-------------------------");
                    System.out.print("Digite o número de alunos: ");
                    int quantidadeAlunos = scanner.nextInt();
                    for (int i = 0; quantidadeAlunos != i; i++) {
                        scanner.nextLine();
                        System.out.print("Digite o nome do aluno: ");
                        nomeAluno = scanner.nextLine();

                        System.out.print("Digite a nota do aluno: ");
                        notaAluno = scanner.nextDouble();

                        mapsManipulator.adicionarNota(notas, notaAluno, nomeAluno);
                    }
                    System.out.println("Aluno e nota adicionados com sucesso");
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------");
                    scanner.nextLine();
                    System.out.print("Digite o nome do aluno que deseja remover: ");
                    String nomeAlunoRemover = scanner.nextLine();
                    mapsManipulator.removerNota(notas, nomeAlunoRemover);
                    System.out.println("Aluno removido com sucesso");
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Listando alunos e notas...");
                    mapsManipulator.exibeMapa(notas);
                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.printf("A soma das notas é %.2f\n", mapsManipulator.somarNota(notas));
                    System.out.println("-------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------");
                    System.out.printf("A média das notas é %.2f\n", mapsManipulator.mediaNotas(notas));
                    System.out.println("-------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------");
                    mapsManipulator.notaMaior(notas);
                    System.out.println("-------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------");
                    mapsManipulator.notaMenor(notas);
                    System.out.println("-------------------------");
                    break;
            }
        }
    }
}