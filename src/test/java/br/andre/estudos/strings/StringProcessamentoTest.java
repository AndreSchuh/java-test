package br.andre.estudos.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessamentoTest {
    StringProcessamento principal = new StringProcessamento();

    @Test
    @DisplayName("Testa o método que retorna a quantidade de caracteres de uma palavra")
    void quantidadeCaracteresTest() {
        String texto = "Andre";
        int resultado = principal.quantidadeCaracteres(texto);
        assertEquals(5, resultado); //deve ser 5
        assertNotEquals(6, resultado); //não deve ser 6
    }

    @Test
    @DisplayName("Testa se a palavra foi invertida de forma correta")
    void inverteTextoTest(){
        String texto = "Elieser Prichua";
        String resultado = principal.inverteTexto(texto);
        assertEquals("auhcirP reseilE", resultado);
        assertNotEquals("Elieser Prichua", resultado);
        assertNotEquals("reseile auhcirp", resultado);
    }
}