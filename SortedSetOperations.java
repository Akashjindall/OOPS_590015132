package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOperations {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        // Insertion
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // Searching
        if (set.contains(10)) {
            System.out.println("10 is present");
        }

        // Updation (remove + add)
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