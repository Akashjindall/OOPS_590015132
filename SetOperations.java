package collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // Searching
        if (set.contains(10)) {
            System.out.println("10 is present");
        }

        // Updation
        set.remove(30);
        set.add(50);
        System.out.println("After Updation: " + set);

        // Traversal
        System.out.println("Traversal:");
        for (int num : set) {
            System.out.println(num);
        }
    }
}