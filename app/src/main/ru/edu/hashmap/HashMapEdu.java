package ru.edu.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEdu {

    public static void main(String[] args) {
        Key k = new Key("id", "name");
        Value v = new Value("trace");

        Map<Key, Value> map = new HashMap<>();
        map.put(k, v);

        System.out.println(map.get(k));
        k.setId("newId");
        System.out.println(map.get(k));

    }
}
