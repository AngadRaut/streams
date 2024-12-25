package exam22Dec2024;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortByKey {
    public static void main(String[] args) {
        Map<String,Integer> originalMap = new HashMap<>();
        originalMap.put("nana",2);
        originalMap.put("abharati",9);
        originalMap.put("raj",5);
        originalMap.put("hari",3);
        System.out.println(originalMap);
        // sort the map by using key
       Map<String,Integer> sortedByValue =  originalMap.entrySet().stream()
               .sorted((a,b)->a.getValue()-b.getValue())
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                       Integer::compareTo, LinkedHashMap::new));
        System.out.println(sortedByValue);

        // sort second way
        Map<String,Integer> sort = new TreeMap<>(originalMap);
        System.out.println("sort the map converting it into treeMap = "+sort);
    }
}
