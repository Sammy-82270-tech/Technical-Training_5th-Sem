import java.util.*;

public class Number_Guessing_Game_StepCounter{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
       Arrays.sort(arr);
       int target = sc.nextInt();
       boolean find = false;
       
       int low = 0;
       int high = arr.length - 1;
       
       int count = 0;
       
       while(low <= high){
           count ++;
           
           int mid = (low + high) /2;
           
           if(arr[mid] == target){
               System.out.println("Number Found at Position "+mid+" in "+count +" Step(s)");
               find = true;
               break;
           }
           else if(arr[mid] > target){
               high = mid -1;
           }
           else{
               low = mid + 1;
           }
       }
       if(! find){
           System.out.println(" Number Not Found after "+count+" Step(s)");
       }
        
        sc. close();
        
    }
}