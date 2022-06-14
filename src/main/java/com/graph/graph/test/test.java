package com.graph.graph.test;

import com.graph.graph.graphcore.GraphHashMap;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        GraphHashMap graph = new GraphHashMap();
        graph.put("C", new HashMap<String, Long>());
        graph.put("A", new HashMap<String, Long>());
        graph.put("D", new HashMap<String, Long>());
        graph.put("B", new HashMap<String, Long>());
        graph.get("B").put("D", 3L);
        graph.get("A").put("B", 1L);
        graph.get("C").put("D", 4L);
        graph.get("A").put("C", 2L);
        System.out.println(graph.size());
        System.out.println(graph.get("A").size());
        System.out.println(graph.toString());
        for(String key : graph.keySet()) {
            System.out.print(key + " : ");
            for(String key2 : graph.get(key).keySet()) {
                System.out.println(key2 + " " + graph.get(key).get(key2));
            }
        }
    }
}