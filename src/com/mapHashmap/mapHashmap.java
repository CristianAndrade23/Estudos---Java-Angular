package com.mapHashmap;

import java.util.HashMap;
import java.util.Map;

public class mapHashmap {
    public static void main(String[] args){
        Map<Integer, String> nomes = new HashMap<> ();

        nomes.put(null, "Chapolim"); // adiciona valores ou substituui valores existentes
        nomes.put(888, "Ademilson");
        nomes.put(333, "Bruce Lee");

//        System.out.println(nomes.keySet()); // percorre as chaves do map
//        System.out.println(nomes.values()); // percorre os valores do map

//        nomes.put(777, "Chaves");  // substitui o elemento existente
//        System.out.println(nomes.get(777));

        System.out.println(nomes.containsKey(888)); // procura o numero na estrutura de chaves
        System.out.println(nomes.containsValue("FFF")); // procura o valor na estrutura de valores

    }
}
