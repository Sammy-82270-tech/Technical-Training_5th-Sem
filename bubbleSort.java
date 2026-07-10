import java.util.*;

public class bubbleSort{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int []Arr = new int[n];
        
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
        
        // System.out.println("Unsorted Array: ");
        
        // for(int num : Arr){
        //     System.out.print(num+" ");
        // }
        // System.out.println();
        
        for(int i = 0; i < Arr.length -1; i++){
            for(int j = 0; j < Arr.length -i-1; j++){
                if(Arr[j] > Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array: ");
        
        for(int num : Arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}