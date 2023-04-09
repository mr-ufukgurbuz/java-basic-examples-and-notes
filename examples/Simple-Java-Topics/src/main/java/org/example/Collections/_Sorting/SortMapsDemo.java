package org.example.Collections._Sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapsDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(linkedHashMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(9,"fox");
        map.put(2,"cat");
        map.put(3,"dog");
        map.put(4,"swan");
        map.put(7,"bear");
        map.put(1,"snake");

        for (Integer key: map.keySet()){
            String value = map.get(key);

            System.out.println(key + " :" + value);
        }

    }
}
