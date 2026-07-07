// Program 8: Write a Java program that takes five numbers as input to calculate and print the average of those numbers.
// Output:
// Input first number: 10
// Input second number: 30
// Input third number: 50
// Input fourth number: 70
// Enter fifth number: 90
// Average of five numbers is: 50

import java.util.*;

public class QUEST_2{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st Number: ");
    int num_1 = sc.nextInt();
    
    System.out.print("Enter 2nd Number: ");
    int num_2 = sc.nextInt();

    System.out.print("Enter 3rd Number: ");
    int num_3 = sc.nextInt();

    System.out.print("Enter 4th Number: ");
    int num_4 = sc.nextInt();

    System.out.print("Enter 5th Number: ");
    int num_5 = sc.nextInt();

    System.out.println("THE AVG OF NUMBERS: "+ (num_1 + num_2 + num_3 + num_4 + num_5)/5);

  }
}