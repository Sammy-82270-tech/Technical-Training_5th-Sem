import java.util.Scanner;

public class String_Coded {

    public static String Str_Coded(String str) {

        String temp = str.toLowerCase();

        char[] ch = temp.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                ch[i] = '4';
            } else if (ch[i] == 'e') {
                ch[i] = '3';
            } else if (ch[i] == 'i') {
                ch[i] = '1';
            } else if (ch[i] == 'o') {
                ch[i] = '0';
            } else if (ch[i] == 's') {
                ch[i] = '5';
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The String: ");
        String s = sc.nextLine();

        String result = Str_Coded(s);
        System.out.println(result);

        sc.close();
    }
}
