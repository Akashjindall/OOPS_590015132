package collections;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMapOperations {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        // Insertion
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println("After Insertion: " + map);

        // Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // Searching
        if (map.containsKey(1)) {
            System.out.println("Key 1 is present: " + map.get(1));
        }

        // Updation
        map.put(3, "Orange");
        System.out.println("After Updation: " + map);

        // Traversal (CORRECT LINE)
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}