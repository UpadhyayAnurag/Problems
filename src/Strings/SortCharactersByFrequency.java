package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b)->
                map.get(b.getKey())-map.get(a.getKey()));
        // Finding counts based using Hashmap
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        // Pushing entry set values from the hashmap to queue based on custom comparison
        pq.addAll(map.entrySet());

        // Retrieving data from the queue and pushing into a string builder
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            Map.Entry<Character, Integer> entry = pq.poll();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
