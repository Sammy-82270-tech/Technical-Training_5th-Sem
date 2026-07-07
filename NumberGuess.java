import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random_num = (int) ((Math.random() * 20) + 1);

        int count = 0;

        System.out.print("Guess the Number [1 to 20]: ");
        int input_number = sc.nextInt();

        while (input_number != random_num) {
            count++;
            if (input_number > random_num) {
                System.out.println("Ur No. too big, try again....!");
            } else if (input_number < random_num) {
                System.out.println("Ur No. too small, try again...l");
            }
            System.out.println("Please Enter The Valid Number..");
            input_number = sc.nextInt();
        }
        count++;
        System.out.println("your input number is " + input_number);
        System.out.println("The Random number is " + random_num);
        System.out.println("So, Congratulation at last you got it in " + count + " attempts...");

        sc.close();

    }
}