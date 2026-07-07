import java.util.Scanner;

public class JosephusProblem {

    public static Object josephus(int n) {
        if (n < 1) {
            return false;
        }

        int survivor = 0; 

        for (int i = 2; i <= n; i++) {
            survivor = (survivor + 2) % i;
        }

        return survivor;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter The Number Of Person-Position: ");
        int n = sc.nextInt();

        Object result = josephus(n);
        System.out.println(result);

        sc.close();
    }
}