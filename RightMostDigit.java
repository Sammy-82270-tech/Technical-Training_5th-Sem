// Program 10: Write a Java program that reads a floating-point number and then display the right-most digit of the integral part of the number.
// Input:
// Enter the Numbers: 2589.3654
// Output:
// Right Most Value = 9

import java.util.Scanner;

public class QUEST_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE FLOTING NUMBER:");
        float num = sc.nextFloat();

        int NUM = (int)num;
        int  NUM1 =  NUM % 10;

        System.out.println("Right most Digit: "+ NUM1);
    }
}
