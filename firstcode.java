// import java.util.scanner;

// public class firstcode {
//     public static void main (String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = 5;
//         String [] str = new String[n];

//         for (int i = 0; i < n; i++) {
//             str[i] = sc.nextLine();
        
//             for (string s : str) {
//                 System.out.println(s);
//             }

//             Sc.close();
//         }
//     }
// }





import java.util.Scanner;

public class firstcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        String[] str = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        // Output
        for (String s : str) {
            System.out.println(s);
        }

        sc.close();
    }
    
}



