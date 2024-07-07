package br.andre.estudos.mapas;

import java.util.HashMap;
import java.util.Map;

public class MapsManipulator {

    public Map adicionarNota(Map<String, Double> notas, double notaAluno, String nomeAluno) {
        notas.put(nomeAluno, notaAluno);
        return notas;
    }

    public Map removerNota(Map<String, Double> notas, String nomeAluno) {
        notas.remove(nomeAluno);
        return notas;
    }

    public double somarNota(Map<String, Double> notas) {
        int soma = 0;

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            soma += entrada.getValue();
        }
        return soma;
    }

    public double mediaNotas(Map<String, Double> notas) {
        int soma = 0;
        double media;

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            soma += entrada.getValue();
        }

        media = soma / notas.size();

        return media;
    }

    public Map<String, Double> notaMaior(Map<String, Double> notas) {
        double maiorNota = 0;
        Map<String, Double> maior = new HashMap();

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            String alunoAtual = entrada.getKey();
            double notaAtual = entrada.getValue();

            if (notaAtual > maiorNota) {
                maiorNota = notaAtual;
                maior.clear();
                maior.put(alunoAtual, notaAtual);
            }
        }
        return maior;
    }

    public String nomeAlunoNotaMaior(Map<String, Double> notas, double maiorNota) {
        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            if (entrada.getValue() == maiorNota) {
                return entrada.getKey();
            }
        }
        return "";
    }

    public Map<String, Double> notaMenor(Map<String, Double> notas) {
        double menorNota = 10000000;
        Map<String, Double> menor = new HashMap();

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            String alunoAtual = entrada.getKey();
            double notaAtual = entrada.getValue();

            if (notaAtual < menorNota) {
                menorNota = notaAtual;
                menor.clear();
                menor.put(alunoAtual, notaAtual);
            }
        }
        return menor;
    }

    public void notaMenor2(Map<String, Double> notas) {
        notas.entrySet().stream().min(Map.Entry.comparingByValue()).ifPresent(mapa -> System.out.println("Menor nota: " + mapa.getValue() + " Aluno: " + mapa.getKey()));
    }

    public void notaMaior2(Map<String, Double> notas) {
        notas.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(mapa -> System.out.println("Maior nota: " + mapa.getValue() + " Aluno: " + mapa.getKey()));
    }

    public void exibeMapa(Map<String, Double> notas) {notas.forEach((key, value) -> System.out.println("Aluno: " + key + " - Nota: " + value));}
}