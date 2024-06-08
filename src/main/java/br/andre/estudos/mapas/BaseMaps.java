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
//      numeros.put(null, "Zero"); CHAVE NULA
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

        System.out.println();
        System.out.println();
        System.out.println("LINKED HASH MAP!");

        LinkedHashMap<String, String> capitais = new LinkedHashMap<>();

        capitais.put("Salvador", "Bahia");
        capitais.put("Belém", "Pará");
        capitais.put("Boa vista", "Roraima");
        capitais.put(null, "Porto Alegre"); //Chave nula

        System.out.println(capitais); //Mostra o mapa e como pode se observar está na ordem de inserção


//        Agora explique com suas palavras quando é melhor usar um ou outro (pode ser mediante comentários).

//        Se no projeto onde está sendo utilizado maps não é necessário pouca memória, inserções nulas e uma velocidade
//        de inserção e busca boa o treeMap é recomendado para isso. Já o linkedHashMap utiliza uma memória menor e possibilidade
//        de chaves nulas. Porém sua performance acaba sendo mais lenta comparado com o outro.

    }
}
