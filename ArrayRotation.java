import java.util.*;
public class Main{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int[] arr = new int[n];
       
       for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }
       
       int k = sc.nextInt();
       
       k = k % n;
       
       int rotated[] = new int[n];
       
       for(int i = 0; i< n;i++){
           rotated[i] = arr[(i+k)%n];
       }
       
       for(int nums: rotated){
           System.out.print(nums+" ");
       }
       sc.close();
    }
}