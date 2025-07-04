package ru.edu.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEdu {

    public static void main(String[] args) {

        // Потеря элемента в hashmap-е
        Key k = new Key("id", "name");
        Value v = new Value("trace");

        Map<Key, Value> map = new HashMap<>();
        map.put(k, v);

        System.out.println(map.get(k));
        k.setId("newId");
        System.out.println(map.get(k));




        Map<Key, Value> map2 = Map.of(
                new Key("3", "name3"), new Value("value3"),
                new Key("1", "name1"), new Value("value1")
        );

        System.out.println(map.entrySet());
    }
}
