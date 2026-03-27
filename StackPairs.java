// //  wap to create a stack of 10 elements taking from user input find no. of pairs of elements that can sum upto values line range 1 to 9 
package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // 1. Input 10 elements from the user
        System.out.println("Enter 10 integers for the stack:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
            stack.push(scanner.nextInt());
        }

        // 2. Find pairs that sum to range [1, 9]
        int pairCount = 0;
        System.out.println("\nPairs found:");

        // Nested loops to check every unique pair
        for (int i = 0; i < stack.size(); i++) {
            for (int j = i + 1; j < stack.size(); j++) {
                int sum = stack.get(i) + stack.get(j);
                
                // Check if sum is in range [1, 9]
                if (sum >= 1 && sum <= 9) {
                    pairCount++;
                    System.out.println("(" + stack.get(i) + ", " + stack.get(j) + ") -> Sum: " + sum);
                }
            }
        }

        System.out.println("\nTotal number of pairs with sum in range [1, 9]: " + pairCount);
        scanner.close();
    }
}