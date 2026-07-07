import java.util.*;
public class AnagramChecker
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE 1'ST STRING:");
        String s1 = sc.next();

        System.out.println("ENTER THE 2'ND STRING: ");
        String s2 = sc.next();
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        // for(int i=0;i<c1.length;i++){
        //     System.out.print(c1[i]);
        // }
        // for(int i=0;i<c1.length;i++){
        //     System.out.print(c2[i]);
        // }
        
        if(Arrays.equals(c1,c2)){
            System.out.println("The two strings are anagrams of each other.");
        }
        else{
            System.out.println("The two strings are not anagrams of each other.");
        }

	}
}