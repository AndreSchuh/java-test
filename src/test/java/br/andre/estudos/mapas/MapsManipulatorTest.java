package br.andre.estudos.mapas;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapsManipulatorTest {

    MapsManipulator mapaPrincipal = new MapsManipulator();
    Map<String, Double> notas = new HashMap<>();
    String nomeAluno = "Elieser";
    double notaAluno = 90;

    @Test
    void adicionarNotaTest(){

        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);

        assertEquals(90, notas.get("Elieser"));
    }

    @Test
    void removerNotaTest(){

        mapaPrincipal.removerNota(notas, nomeAluno);

        assertEquals(null, notas.get(null));
    }

    @Test
    void somarNotaTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals(150.0, mapaPrincipal.somarNota(notas));
    }

    @Test
    void mediaNotasTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals(75.0, mapaPrincipal.mediaNotas(notas));
    }

    @Test
    void maiorNotaTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals(90, notas.get("Elieser"));
    }

    @Test
    void nomeMaiorNotaTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals("Elieser", mapaPrincipal.nomeAlunoNotaMaior(notas, notaAluno));
    }

    @Test
    void notaMenorTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals(60, notas.get("André"));
    }
}
