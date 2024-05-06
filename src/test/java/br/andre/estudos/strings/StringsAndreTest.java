package br.andre.estudos.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsAndreTest {

    @Test
    @DisplayName("Testa o método que retorna a quantidade de caracteres de uma palavra")
    void quantidadeTest() {
        StringsAndre.palavra = "Andre";
        int resultado = StringsAndre.quantidade();
        assertEquals(5, resultado); //deve ser 5
        assertNotEquals(6, resultado); //não deve ser 6
    }
}