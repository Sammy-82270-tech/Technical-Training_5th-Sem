import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Word: ");
        String s = sc.next();
        
        int i = 0;
        int j = s.length()-1;
        
        while (i < j){
            if (s.charAt(i) != s.charAt(j)) {
              System.out.println(" Not Palindrom");
              return;   
            }
            i++;j--;
        }
        
        System.out.println("Palindrome");
    }
}
