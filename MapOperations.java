package collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
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

        // Traversal
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}