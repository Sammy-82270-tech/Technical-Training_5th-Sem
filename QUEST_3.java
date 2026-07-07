// Program 9: Given the values of the variables x, y and z, write a Java program to rotate their values such that x has the value of y, y has the value of z and z has the value of x.
// Input:
// Enter 1st Numbers: 10
// Enter 2nd Numbers: 50
// Enter 3rd Numbers: 60
// Output:
// Before Swapping –
// x = 10
// y = 50
// z = 60
// After Swapping -
// x = 50
// y = 60
// z = 10

import java.util.Scanner;

public class QUEST_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Numbers:");
        int x = sc.nextInt();

        System.out.println("Enter 1st Numbers:");
        int y = sc.nextInt();

        System.out.println("Enter 1st Numbers:");
        int z = sc.nextInt();

        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("z: "+ z);

        int temp;
        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("AFTER SWAPING");

        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("z: "+ z); 
    }
}
