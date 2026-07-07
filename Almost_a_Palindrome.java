import java.util.Scanner;

public class Almost_a_Palindrome {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter The String: ");
        String str = sc.next();

        int i = 0;
        int j = str.length() -1;
        int count = 0;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                // System.out.println(" Not palindrome");
                count = count + 1;
            }
            i++;
            j--;
        }

        if (count == 0) {
            System.out.println("String is already a Palindrome");
        }
        else if (count == 1) {
            System.out.println("True");
        }
        else if(count >=2){
            System.out.println("False");
        }

        // System.out.println("palindrome");

        sc.close();
    }
}