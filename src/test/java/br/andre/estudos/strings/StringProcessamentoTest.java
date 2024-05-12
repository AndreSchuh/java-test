package br.andre.estudos.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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

    @DisplayName("Testa o método que retorna a palavra minúscula")
    @ParameterizedTest
    @ValueSource(strings = {"Andre:andre", "Elieser:elieser", "Prichua:prichua", "Fulano:fulano", "ciclanO:ciclano"})
    void textoMinusculoParametrizedExampleTest(String texto) {
        String[] partes = texto.split(":");
        String resultado = principal.textoMinusculo(partes[0]);
        assertEquals(partes[1], resultado);
    }

    @DisplayName("Testa o método que retorna a primeira letra maiúsucula ")
    @ParameterizedTest
    @ValueSource(strings = {"andre:Andre", "elieser:Elieser", "vasco:Vasco"})
    void textoMaiuculoPrimeiroParametrizedExampleTest(String texto) {
        String[] partes = texto.split(":");
        String resultado = principal.upperCaseFirst(partes[0]);
        assertEquals(partes[1], resultado);
    }

    @DisplayName("Testa o método que retorna se há um palíndromo")
    @ParameterizedTest
    @CsvSource({"ovo,true", "ala,true", "VASCO,false"})
    void textoPalindromoParametrizedExampleTest(String texto, boolean expectedResult) {
        boolean resultado = principal.textoPalindromo(texto);
        assertEquals(expectedResult, resultado);
    }

    @DisplayName("Testa o método que retorna a quantidade de palavras")
    @ParameterizedTest
    @ValueSource(strings = {"ovo:1", "ala esquerda:2", "VASCO da Gama:3"})
    void quantidadeDePalavrasParametrizedExampleTest(String texto) {
        String[] partes = texto.split(":");
        int resultado = principal.quantidadePalavra(partes[0]);
        assertEquals(Integer.parseInt(partes[1]), resultado);
    }

    @DisplayName("Testa se os espaços serão retirados")
    @ParameterizedTest
    @ValueSource(strings = {"   Flamengo  :Flamengo", "    Elieser     :Elieser", "   Vasco :Vasco"})
    void textoSemEspacoParametrizedExampleTest(String texto) {
        String[] partes = texto.split(":");
        String resultado = principal.textoSemEspaco(partes[0]);
        assertEquals(partes[1], resultado);
    }

    @DisplayName("Testa se o caractere escolhido será o certo")
    @ParameterizedTest
    @CsvSource({"Internacional,I,0", "Gremio,r,1", "Laudo,a,1"})
    void caractereEscolhidoParametrizedTest(String texto, char resultadoEsperado, int posicao) {
        char resultado = (principal.caractereDePosicao(texto, posicao));
        assertEquals(resultadoEsperado, resultado);
    }

    @DisplayName("Testa se o texto até o caractere escolhido será o certo")
    @ParameterizedTest
    @CsvSource({"Internacional,Internacionao,l,o", "Gremio,Grebio,m,b", "Laudo,Lauro,d,r"})
    void textoAteCaractereEscolhidoParametrizedTest(String texto, String resultadoEsperado, String caracterSubstituir, String caracterInserir) {
        String resultado = (principal.trocaPosicaoCaractere(texto, caracterSubstituir, caracterInserir));
        assertEquals(resultadoEsperado, resultado);
    }

    @DisplayName("Testa se o caractere escolhido será removido")
    @ParameterizedTest
    @CsvSource({"Internacional,Intenacional,r", "Gremio,remio,G", "Laudo,Lado,u"})
    void removeCaractereParametrizedTest(String texto, String resultadoEsperado, String removeCaractere) {
        String resultado = principal.removeCaractereTexto(texto, removeCaractere);
        assertEquals(resultadoEsperado, resultado);
    }

    @DisplayName("Testa se o caractere escolhido será removido")
    @ParameterizedTest
    @CsvSource({"Internacional com , e : teste,Intenacional com , e : teste,r"})
    void removeCaractereParametrized2Test(String texto, String resultadoEsperado, String removeCaractere) {
        String resultado = principal.removeCaractereTexto(texto, removeCaractere);
        assertEquals(resultadoEsperado, resultado);
    }

    @DisplayName("Testa se o caractere escolhido será removido com @MethodSource")
    @ParameterizedTest
    @MethodSource("removeCaractereParametrized3Args")//deve informar o nome do método que fornece os argumentos de entrada
    void removeCaractereParametrized3Test(String texto, String resultadoEsperado, String caracterRemover) {
        String resultado = principal.removeCaractereTexto(texto, caracterRemover);
        assertEquals(resultadoEsperado, resultado);
    }

    //método que fornece os argumentos de entrada para o teste
    public static Stream<Arguments> removeCaractereParametrized3Args() {
        return Stream.of(
                Arguments.of("Internacional com , e : teste", "Intenacional com , e : teste", "r"),
                Arguments.of("Outro exemplo com virg , e com dois pontos :", "Outro xmplo com virg ,  com dois pontos :", "e")
        );
    }





}