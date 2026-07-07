import java.util.Scanner;

public class Algebric_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE ALGEBRIC EQUATION: ");
        String A_eq = sc.nextLine();

        String []Equ = A_eq.split(" ");

        int X ;

        if (Equ[0].equals('x')) {
            if (Equ[1].equals('+')) {
                X = (Equ[4] - Equ[2]);        
            }
        }

    }
}
