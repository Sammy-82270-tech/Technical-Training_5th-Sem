// Program 5: Write a Java program to read 2 numbers dynamically from the user and perform the addition, multiply, subtract, divide and remainder Operations on them and print the results.
// Output:
// Input first number: 125
// Input second number: 24
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5
import java.util.*;

public class Day_1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Numer: ");
        int Num_1 = sc.nextInt();
        System.out.println("Enter 2nd Numer: ");
        int Num_2 = sc.nextInt();

        System.out.println("ADDITION: " + (Num_1 + Num_2));
        System.out.println("SUBTRACTION: " + (Num_1 - Num_2));
        System.out.println("MULTIPLICATION: " + (Num_1 * Num_2));
        System.out.println("DIVISION: "+ (Num_1 / Num_2));
        System.out.println("REMINDER: "+ (Num_1 % Num_2));
     }
}
