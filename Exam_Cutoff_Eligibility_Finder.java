import java.util.*;

public class Exam_Cutoff_Eligibility_Finder{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double [] arr = new double[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        
       Arrays.sort(arr);
       double target = sc.nextDouble();

       int low = 0;
       int high = arr.length - 1;
       int ans = -1;
       
       while(low <= high){

           int mid = (low + high) /2;
           
           if(arr[mid] == target){
               ans = mid;
               high = mid - 1;
           }
           else if(arr[mid] > target){
               high = mid -1;
           }
           else{
               low = mid + 1;
           }
       }
       if(ans == -1){
           System.out.println("No Candidate Meets Cutoff");
       }
       else{
           System.out.println("Eligibility Starts at Index "+ans);
       }
        sc. close();
    }
}