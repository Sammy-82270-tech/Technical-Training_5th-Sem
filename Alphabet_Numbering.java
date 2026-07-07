import java.util.Scanner;

public class Alphabet_Numbering {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter The String: ");
        String S = sc.nextLine();
        
        S = S.toLowerCase();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch >= 'a' && ch <= 'z' ) {
                int position = (ch -'a') + 1;

                System.out.print(position+" ");
            }
        }
        sc.close();
    }
}