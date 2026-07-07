import java.util.Scanner;

public class Check_X_O {

    public static boolean X_o_check(String s) {
        s = s.toLowerCase();

        int countX = 0;
        int countO = 0;

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'x') {
                countX++;
            } else if (ch[i] == 'o') {
                countO++;
            }
        }

        return countO == countX;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String str = sc.next();

        boolean res = X_o_check(str);

        System.out.println(res);

        if (res = true) {
            System.out.println("Number of \"o\" and \"x\" are matching...");
        } else {
            System.out.println("Number of \"o\" and \"x\" are not matching...");
        }

        sc.close();
    }
}