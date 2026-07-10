import java.util.*;

public class AnagramIndexFinder{
    
    public static boolean IsAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        
        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
    
    public static int findAnagramIndex(String []dictonary, String target){
        int result = -1;
        for(int i = 1; i < dictonary.length; i++){
           if(IsAnagram(dictonary[i],target)){
               result = i;
            //   System.out.println(dictonary[i]);
               break;
           }
        }
        return result;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String []dictonary = sc.nextLine().split(" ");
        
        String target = sc.nextLine();
        
        int result = findAnagramIndex(dictonary, target);
        
        System.out.println(result);
        
        sc.close();
    }
}