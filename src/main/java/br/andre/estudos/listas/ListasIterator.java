package br.andre.estudos.listas;

import java.util.ArrayList;
import java.util.Iterator;

/* Iterator
O Iterator é uma interface em Java que pertence ao pacote java.util e fornece um meio padrão de percorrer elementos em uma coleção, como uma lista, conjunto ou fila. Ele é utilizado para acessar os elementos de uma coleção sequencialmente sem expor a sua estrutura subjacente.

# Funcionalidades do Iterator
A interface Iterator fornece três métodos principais:

 > hasNext():

Retorna true se a iteração tiver mais elementos.
Retorna false quando todos os elementos tiverem sido iterados.


 > next():

Retorna o próximo elemento na iteração.
Lança uma exceção NoSuchElementException se não houver mais elementos.


 > remove():

Remove o último elemento retornado pelo iterador da coleção subjacente.
Lança uma exceção UnsupportedOperationException se a operação de remoção não for suportada pela coleção.

## Vantagens do Uso de Iterator
### Encapsulamento da Estrutura da Coleção:

O Iterator oculta a estrutura interna da coleção, permitindo que você percorra elementos sem precisar entender como a coleção é implementada.

### Uniformidade:

Fornece uma maneira uniforme de percorrer diferentes tipos de coleções (List, Set, Queue, etc.).

### Remoção Segura de Elementos:

O método remove permite remover elementos da coleção durante a iteração de maneira segura, evitando problemas como ConcurrentModificationException.


## Diferença entre Iterator e Enhanced For Loop

O loop for aprimorado (ou for-each loop) em Java também é usado para percorrer coleções, mas não fornece todos os recursos do Iterator, como a remoção segura de elementos durante a iteração. Por exemplo, você não pode remover um elemento da coleção durante a iteração usando um loop for aprimorado:


## Quando Usar Iterator
Quando você precisa percorrer uma coleção e potencialmente remover elementos de forma segura durante a iteração.
Quando você deseja maior controle sobre o processo de iteração.
Quando a coleção pode ser de qualquer tipo (e.g., List, Set, Queue), e você quer usar uma abordagem uniforme para iterar sobre os elementos.
Em resumo, o Iterator é uma ferramenta poderosa e flexível para percorrer coleções em Java, oferecendo mais controle e segurança do que os métodos de iteração alternativos em determinadas situações.

*/
public class ListasIterator {
    public static void main(String[] args) {
        // Listas usando interface Iterator (muito utilizada)

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // ou substituir o while acima por
        //iterator.forEachRemaining(System.out::println);
    }
}
