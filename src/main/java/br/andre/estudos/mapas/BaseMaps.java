package br.andre.estudos.mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BaseMaps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("nome", "Elieser");
        map.put("idade", "36");
        map.put("endereco", "Rua 1, 123");
        map.put("telefone", "1234-5678");

        System.out.println("Imprime todo o mapa.");
        System.out.println(map);
        System.out.println("-----------------------------------");
        System.out.println("Imprime o nome.");
        System.out.println(map.get("nome"));

        //remove elemento
        map.remove("endereco");
        System.out.println("-----------------------------------");
        System.out.println(map);


        //usando o putAll, criando map2 e colocando todos os elementos em "map"
        Map<String, String> map2 = new HashMap<>();
        map2.put("mae", "Maria");
        map2.put("pai", "João");
        map.putAll(map2);

        System.out.println("-----------------------------------");
        System.out.println(map);

        //olha o que acontece aqui... o put SUBSTITUI o valor da chave "nome"
        map.put("nome", "Andre");
        System.out.println("-----------------------------------");
        System.out.println(map);

        //verifica se existe a chave "nome"
        System.out.println("-----------------------------------");
        System.out.println(map.containsKey("nome"));
        System.out.println(map.containsKey("nomes"));

        //limpando o map
        map.clear();
        System.out.println("-----------------------------------");
        System.out.println(map);


        //imprimindo somente as chaves uma por linha
        System.out.println("-----------------------------------");
        map2.keySet().forEach(System.out::println);


        //imprimindo somente os valores uma por linha
        System.out.println("-----------------------------------");
        map2.values().forEach(System.out::println);


        //Filtrando pelo valor Maria e imprimindo
        System.out.println("-----------------------------------");
        map2.values().stream().filter(valor-> valor.equals("Maria")).forEach(System.out::println);

        //Filtrando pelo valor != de Maria e imprimindo
        System.out.println("-----------------------------------");
        map2.values().stream().filter(valor-> !valor.equals("Maria")).forEach(System.out::println);

        //Imprimindo tamanho do map
        System.out.println("-----------------------------------");
        System.out.println(map2.size());


        //Iniciando um mapa com Valores já fixos
        Map<String, Integer> map3 = Map.of("um", 1, "dois", 2, "tres", 3);
        System.out.println(map3);


//        Faça exemplos que usem TreeMap, LinkedHashMap e explique a diferença entre eles sobre ordenação e valores nulos.

//        O treMap possui uma ordenação por padrão aleatória coisa que não acontece no hashMap que mantém sua
//        ordenação por inserção e também o linkedHashMap permite chaves nulas o treMap já não como representado no código.

        TreeMap<Integer, String> numeros = new TreeMap<>(); // Cria um treeMap

        System.out.println();
        System.out.println();
        System.out.println("TREE MAP!");

        numeros.put(3, "Três"); //Adiciona elementos ao map
        numeros.put(2, "Dois");
        numeros.put(1,"Um");
        //Aceita somente valor null
        numeros.put(0, null);
        System.out.println("-----------------------------------");
        System.out.println(numeros);// Exibe o map inteiro
        System.out.println("-----------------------------------");

        System.out.println(numeros.get(2));// Exibe chave específica
        System.out.println("-----------------------------------");

        numeros.remove(2); // Remove chave específica
        System.out.println(numeros);
        numeros.get(2); // Recupera chave removida
        System.out.println(numeros);

        System.out.println(numeros.keySet()); // Exibe as chaves em ordem crescente fato que já acontece automaticamente no LinkedHashMap

        System.out.println("Métodos exclusivos do TreeMap!");
        System.out.println(numeros.lastKey());
        System.out.println(numeros.firstKey());
        System.out.println(numeros.lastEntry());
        System.out.println(numeros.firstEntry());

        numeros.put(5, "Cinco");
        numeros.put(4, "Quatro");
        numeros.put(6, "Seis");

        System.out.println("Imprime o primeiro elemento maior que 4");
        System.out.println(numeros.higherEntry(4));

        System.out.println("Imprime o primeiro elemento menor que 4");
        System.out.println(numeros.lowerEntry(4));



        System.out.println();
        System.out.println();
        System.out.println("LINKED HASH MAP!");

        LinkedHashMap<String, String> capitais = new LinkedHashMap<>();

        capitais.put("Salvador", "Bahia");
        capitais.put("Belém", "Pará");
        capitais.put("Boa vista", "Roraima");
        //Aceita chave e valor null
        capitais.put(null, null);

        System.out.println(capitais); //Mostra o mapa e como pode se observar está na ordem de inserção

        System.out.println("\n\nOlha que legal esse método, ele está presente em todos os mapas.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(capitais.get("Porto Alegre")); //vai retornar null
        System.out.println(capitais.getOrDefault("Porto Alegre", "ATENÇÃO: Não existe essa capital!")); //vai retornar o "defaultValue"

//        Agora explique com suas palavras quando é melhor usar um ou outro (pode ser mediante comentários).

//        Se no projeto onde está sendo utilizado maps não é necessário pouca memória, inserções nulas e uma velocidade
//        de inserção e busca boa o treeMap é recomendado para isso. Já o linkedHashMap utiliza uma memória menor e possibilidade
//        de chaves nulas. Porém sua performance acaba sendo mais lenta comparado com o outro.


        /*

            1) Ordenação

            > HashMap:

            Ordem: Não garante nenhuma ordem específica dos elementos. A ordem das chaves e valores pode mudar com o tempo e não é previsível.
            Ordenação: Os elementos não são ordenados de forma específica.

            > LinkedHashMap:

            Ordem: Mantém a ordem de inserção (a ordem em que as chaves foram inseridas no mapa).
            Ordenação: Os elementos não são ordenados de acordo com a ordem natural; eles simplesmente mantêm a ordem de inserção.

            > TreeMap:

            Ordem: Armazena suas entradas em uma estrutura de árvore ordenada. Os elementos são ordenados de acordo com a ordenação natural das chaves ou por um Comparator (ainda não vimos isso) fornecido no momento da criação do mapa.
            Ordenação: Ordena automaticamente os elementos com base na ordem natural das chaves ou no comparador especificado.



            2) Valores Nulos

            > HashMap:

            Chaves: Permite uma chave null.
            Valores: Permite múltiplos valores null.


            > LinkedHashMap:

            Chaves: Permite uma chave null.
            Valores: Permite múltiplos valores null.


            > TreeMap:

            Chaves: Não permite chaves null. Tentar inserir uma chave null resultará em uma NullPointerException.
            Valores: Permite múltiplos valores null.


            > Resumo

            HashMap: Não garante ordem, permite uma chave null e múltiplos valores null.
            LinkedHashMap: Mantém a ordem de inserção, permite uma chave null e múltiplos valores null.
            TreeMap: Ordena as entradas com base na ordenação natural ou em um comparador fornecido, não permite chaves null, mas permite múltiplos valores null.
         */
    }
}
