import java.util.*;

public class ParityCheck {
    public static boolean Parity_check(long x){

        int sum = 0;
        long  temp = x;
        boolean check;

        while (temp > 0) {
            long digit = temp % 10;   
            sum += digit;            
            temp /= 10;              
        }

        if((x % 2) == (sum % 2)){
          check = true;
        }else{
          check = false;
        }
       
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        long Num = sc.nextLong();

        boolean res = Parity_check(Num);
        System.out.println(res);
        
        sc.close();
    }
}    