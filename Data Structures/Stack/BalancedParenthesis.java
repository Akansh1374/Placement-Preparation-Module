import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        String s="({)}";

        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)=='(') || (s.charAt(i)=='[') || (s.charAt(i)=='{')){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    flag=false;
                    break;
                }

                char c=stack.peek();
                // stack.pop();

                if((s.charAt(i) == ')' && c=='(') || (s.charAt(i) == ']' && c=='[') || (s.charAt(i) == '}' && c=='{')){
                    stack.pop();
                }

                else
                    flag=false;
            }
        }
        if(flag)
            System.out.println("It is balanced");

        else
            System.out.println("It is not balanced");
    }
}