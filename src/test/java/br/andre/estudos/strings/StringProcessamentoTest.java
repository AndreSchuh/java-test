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

    @Test
    @DisplayName("Testa se a palavra foi passada para maiúscula de forma correta")
    void textoMaiusculoTest(){
        String texto = "Ola Mundo";
        String resultado = principal.textoMaiusculo(texto);
        assertEquals("OLA MUNDO", resultado);
        assertNotEquals("ola mundo", resultado);
        assertNotEquals("Ola Mundo", resultado);
    }

    @Test
    @DisplayName("Testa se a palavra foi passada para minúscula de forma correta")
    void textoMinusculoTest(){
        String texto = "Ola mundo";
        String resultado = principal.textoMinusculo(texto);
        assertEquals("ola mundo", resultado);
        assertNotEquals("Ola Mundo", resultado);
        assertNotEquals("OLA MUNDO", resultado);
    }
}