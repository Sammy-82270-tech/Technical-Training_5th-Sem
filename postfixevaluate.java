import java.util.*;
public class postfixevaluate{
    public static int postfixEvaluation(String s){
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int op2 = st.pop(); 
                int op1 = st.pop();
                
                int res = 0;
                
                switch(ch){
                    case '+':
                        res = op1 + op2;
                        break;
                    case '-':
                        res = op1 - op2;
                        break;
                    case '*':
                        res = op1 * op2;
                        break;
                    case '/':
                        res = op1 / op2;
                        break;
                }
                st.push(res);
            }
        }
        return st.pop();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int result = postfixEvaluation(str);
        
        System.out.print(result);
        
        sc.close();
    }
}