import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Array 1
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        
        // Array 2
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        
        for(int i = 0; i< m; i++){
            arr2[i] = sc.nextInt();
        }
        
        //Merged Array
        int[] merge = new int[n+m];
        for(int i = 0; i< n; i++){
            merge[i] = arr1[i];
        }
        for(int i = 0; i< m; i++){
            merge[n+i] = arr2[i];
        }
        
        Arrays.sort(merge);
        
        // for(int nums: merge){
        //     System.out.print(nums+" ");
        // }
        
        System.out.print(merge[0]+" ");
        for(int i = 1; i < merge.length; i++){
            if(merge[i] != merge[i-1]){
                System.out.print(merge[i]+" ");
            }
        }
    }
}