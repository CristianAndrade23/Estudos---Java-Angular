package com.stackQueue;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ( 1, "Cristian" );
        Pessoa pessoa2 = new Pessoa ( 2, "Cristian boca murcha" );

        System.out.println (pessoa.equals ( pessoa2 ));

        System.out.println (pessoa);
        System.out.println (pessoa2);

        Map<Integer, Pessoa> map = new HashMap<> (  );

        map.put ( 1,  new Pessoa ( 1, "Cristian" ));

        System.out.println (map.containsValue ( pessoa2 ));
    }
}
