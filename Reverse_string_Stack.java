import java.util.*;

public class Reverse_string_Stack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Stack<Character> stack= new Stack<>();
        String s1 = sc.nextLine();
        
        char []ch = s1.toCharArray();
        
        for(char c:ch){
            stack.push(c);
        }
        
        ArrayList <Character> ch_1 = new ArrayList<>();
        
        while(!stack.isEmpty()){
            ch_1.add(stack.pop());
        }
        
        for(char res : ch_1){
            System.out.print(res);
        }
        sc.close();
    }
}