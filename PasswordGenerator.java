import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Where do you live?: ");
        String city = sc.next();

        String password = "";

        for (int i = 2; i < name.length(); i += 3) {
            if (name.charAt(i) != ' ')
                password += name.charAt(i);
        }

       
        for (int i = 1; i < city.length(); i += 2) {
            if (city.charAt(i) != ' ')
                password += city.charAt(i);
        }

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }

        if (!upper)
            password += "A";

        if (!lower)
            password += "a";

        if (!digit)
            password += "7";

        if (!special)
            password += "@";

        while (password.length() < 8) {
            password += "x";
        }

        System.out.println("Your Password is: " + password);

    }
}