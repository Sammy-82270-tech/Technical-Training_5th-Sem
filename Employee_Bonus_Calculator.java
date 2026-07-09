import java.util.*;

public class Employee_Bonus_Calculator {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String Name;
    double Salary;
    int Rating;
    double bonus_paid = 0;

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      Name = sc.next();
      Salary = sc.nextDouble();
      Rating = sc.nextInt();

      double bonus = 0;

      if (Rating == 5) {
        bonus = Salary * 0.20;
      } else if (Rating == 4) {
        bonus = Salary * 0.15;
      } else if (Rating == 3) {
        bonus = Salary * 0.10;
      } else if (Rating == 2) {
        bonus = Salary * 0.05;
      } else if (Rating == 1) {
        bonus = Salary * 0;
      }

      double Total_Salary = Salary + bonus;
      bonus_paid += bonus;

      System.out.printf("Name: %s, Bonus: %.2f, Total: %.2f%n", Name, bonus, Total_Salary);
    }
    System.out.printf("Total Bonus Paid: %.2f%n", bonus_paid);

  }
}