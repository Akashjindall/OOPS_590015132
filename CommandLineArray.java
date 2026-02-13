// 3. WAP that takes array input from command-line arguments, stores the values in a String array, and prints the array
public class CommandLineArray {
    public static void main(String[] args) {

        // Checking if any command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        // Storing command-line arguments in a String array
        String[] arr = args;

        // Printing the array
        System.out.println("Array elements are:");
        for (int i = 5; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
