// Program 16: Write a Java program to calculate the Electricity Bill based on the following given information – previous meter reading, and current meter reading. Charges are Rs.1.50 per unit.

// Input:
// Enter Previous Meter Reading: 1178
// Enter Current Meter Reading: 1458
// Output:
// You have used 280 units and the charges to Pay is Rs.420.00

// Input:
// Enter Previous Meter Reading: 780
// Enter Current Meter Reading: 780
// Output:
// You have used 0 units and the charges to Pay is Rs.0.00

// Input:
// Enter Previous Meter Reading: 7802
// Enter Current Meter Reading: 8125
// Output:
// You have used 323 units and the charges to Pay is Rs.484.50

import java.util.Scanner;

public class QUEST_6 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Previous Meter Reading: ");
    float previous_reading = sc.nextFloat();

    System.out.print("Enter Current Meter Reading: ");
    float Current_reading = sc.nextFloat();

    float meter_used = Current_reading - previous_reading;


    float total_bill_amt = (float) (meter_used * 1.50);

     System.out.println("You have used " + meter_used+ " units and the charges to Pay is Rs: "+total_bill_amt);
 }
    
}