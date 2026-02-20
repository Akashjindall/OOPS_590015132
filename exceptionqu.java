// wap which contains a class with attributes such as (name :- string,20 ,  age :- integer value < 5 , salary :- float value >3000000 ) in the end print a line data inserted successfully

import java.util.Scanner;

public class exceptionqu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (name.length() > 20) {
                throw new Exception("Name cannot exceed 20 characters.");
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            if (age <= 5) {
                throw new Exception("Age must be greater than 5.");
            }

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();
            if (salary <= 3000000) {
                throw new Exception("Salary must be greater than 30,00,000.");
            }

            System.out.println("\nSuccess! Name: " + name + ", Age: " + age + ", Salary: " + salary);

        } catch (Exception e) {
            System.out.println("Invalid Input: " + e.getMessage());
        } finally {

            System.out.println("Finish code.");
            sc.close();
        }
    }
}