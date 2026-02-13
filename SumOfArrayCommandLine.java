// 6 WAP to calculate sum of elements in an array using command line arguments

public class SumOfArrayCommandLine {

    public static void main(String[] args) {

        int sum = 0;

        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide array elements as command line arguments.");
            return;
        }

        // Convert command line arguments to integers and calculate sum
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
