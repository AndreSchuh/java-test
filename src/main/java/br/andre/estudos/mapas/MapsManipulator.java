package br.andre.estudos.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapsManipulator {

    public Map<String, Double> adicionarNota(Map<String, Double> notas, double notaAluno, String nomeAluno) {
        notas.put(nomeAluno, notaAluno);
        return notas;
    }

    public Map<String, Double> removerNota(Map<String, Double> notas, String nomeAluno) {
        notas.remove(nomeAluno);
        return notas;
    }

    public double somarNota(Map<String, Double> notas) {
        return notas.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double mediaNotas(Map<String, Double> notas) {
        return notas.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    //TODO implementa o notaMaior lá embaixo e remove esse método depois
    /**
     * @deprecated Use {@link #notaMaior(Map)} instead
     *  
     */
    @Deprecated 
    public Map<String, Double> notaMaiorUnused(Map<String, Double> notas) {
        double maiorNota = 0;
        Map<String, Double> maior = new HashMap<>();

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


    public Map.Entry<String, Double> notaMenor(Map<String, Double> notas) {
        Optional<Map.Entry<String, Double>> min = notas.entrySet().stream().min(Map.Entry.comparingByValue());
        min.ifPresent(mapa -> System.out.println("Menor nota: " + mapa.getValue() + " Aluno: " + mapa.getKey()));
        return min.orElseGet(() -> null);
    }

    public  Map.Entry<String, Double> notaMaior(Map<String, Double> notas) {
        //TODO ajustar igual o nota menor acima.
        Optional<Map.Entry<String, Double>> max = notas.entrySet().stream().max(Map.Entry.comparingByValue());
        max.ifPresent(mapa -> System.out.println("Menor nota: " + mapa.getValue() + " Aluno: " + mapa.getKey()));
        return max.orElseGet(() -> null);
    }

    public void exibeMapa(Map<String, Double> notas) {notas.forEach((key, value) -> System.out.println("Aluno: " + key + " - Nota: " + value));}
}