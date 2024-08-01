package br.andre.estudos.listas;

import java.util.ArrayList;
import java.util.Collections;

/* Usando Sort em Listas

Set e Queue não são diretamente ordenáveis com Collections.sort porque não garantem uma ordem específica dos elementos. No entanto, você pode converter um Set ou Queue em uma lista, ordená-la e, se necessário, reconverter.
*/
public class ListasSort{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("B");

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
