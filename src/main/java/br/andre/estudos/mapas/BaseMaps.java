package br.andre.estudos.mapas;

import java.util.HashMap;
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
//        TODO implementa exemplos abaixo




//        Agora explique com suas palavras quando é melhor usar um ou outro (pode ser mediante comentários).


    }
}
