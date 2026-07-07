import java.util.Scanner;

public class ZeroCasesCalculator {
    public static int daysToZero(int recovers, int new_cases, int active_cases) {
        int netDecrease = recovers - new_cases;
        // Round up division
        return (int) (active_cases / netDecrease) +1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter daily average recovered cases: ");
        int recovers = sc.nextInt();

        System.out.print("Enter daily average new cases: ");
        int new_cases = sc.nextInt();

        System.out.print("Enter current active cases: ");
        int active_cases = sc.nextInt();

        int days = daysToZero(recovers, new_cases, active_cases);
        System.out.println("Days to reach zero cases: " + days);

        sc.close();
    }
}
