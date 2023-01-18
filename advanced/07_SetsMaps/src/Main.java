import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        Map<String, Integer> countByName = new HashMap<>();

        countByName.put("Pesho", 2);
        countByName.put("Gosho", 5);
        countByName.put("Maria", 3);

        countByName
            .entrySet()
            .stream()
            .sorted(comparingByValue())
            .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

//        countByName
//            .keySet()
//            .forEach(key -> );
//
//        set.forEach(elem -> );
    }
}