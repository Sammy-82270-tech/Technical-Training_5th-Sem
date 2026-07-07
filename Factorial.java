import java.util.Scanner;

public class Factorial {

    public static void FactorialORnot() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int x = sc.nextInt();
        
        long fact = 1;

        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }

        System.out.println(x + "!= " + fact);
        sc.close();
    }

    public static void main(String[] args) {
        FactorialORnot();
    }
}