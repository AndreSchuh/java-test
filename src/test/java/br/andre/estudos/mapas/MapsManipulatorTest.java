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
        assertEquals(1, notas.size()); // <<<<<<<<<<<<<<< valida quantos elementos tem no map
    }

    @Test
    void removerNotaTest(){

        mapaPrincipal.removerNota(notas, nomeAluno);

        assertEquals(null, notas.get(null));
        assertEquals(0, notas.size());// <<<<<<<<<<<<<<< valida quantos elementos tem no map
    }

    @Test
    void somarNotaTest(){
        //fica estranho desse jeito!!!!!!!!!!
//        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
//        notas.put("André", 60.0);
//
//        assertEquals(150.0, mapaPrincipal.somarNota(notas));

        //faz assim
        notas.clear();
        notas.put("Elieser", 90.0);
        notas.put("André", 60.0);
        assertEquals(150.0, mapaPrincipal.somarNota(notas));
    }

    @Test
    void mediaNotasTest(){
        //fica estranho desse jeito!!!!!!!!!!
//        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
//        notas.put("André", 60.0);
//
//        assertEquals(75.0, mapaPrincipal.mediaNotas(notas));

        //faz assim
        notas.clear();
        notas.put("Elieser", 90.0);
        notas.put("André", 60.0);
        assertEquals(75.0, mapaPrincipal.mediaNotas(notas));

    }

    //TODO (Remover) não precisa, esse método não é usado no sistema. Não criamos método só para teste, não faz sentido.
    @Test
    void nomeMaiorNotaTest(){
        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
        notas.put("André", 60.0);

        assertEquals("Elieser", mapaPrincipal.nomeAlunoNotaMaior(notas, notaAluno));
    }

    @Test
    void notaMenorTest(){
        //fica estranho desse jeito!!!!!!!!!!
//        mapaPrincipal.adicionarNota(notas, notaAluno, nomeAluno);
//        notas.put("André", 60.0);
//
//        assertEquals(60, notas.get("André"));

        //faz assim
        notas.clear();
        notas.put("Elieser", 90.0);
        notas.put("André", 95.0);
        Map.Entry<String, Double> menorNota = mapaPrincipal.notaMenor(notas);
        assertEquals("Elieser", menorNota.getKey());
        assertEquals(90, menorNota.getValue());
        assertEquals(2, notas.size());
    }

    //TODO implementar o teste do nota maior
    @Test
    void notaMaiorTest(){}
}
