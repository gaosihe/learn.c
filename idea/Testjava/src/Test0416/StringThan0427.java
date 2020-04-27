package Test0416;

import java.util.Stack;

public class StringThan0427 {
    public static void main(String[] args) {
        String S ="ab##";
        String T = "s#f#";
        System.out.println(backspaceCompare(S,T));
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack();
        for(char c: S.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }else if(!stack.empty()){
                stack.pop();
            }
        }
        Stack<Character> stack1 = new Stack();
        for(char c: T.toCharArray()){
            if(c!='#'){
                stack1.push(c);
            }else if(!stack1.empty()){
                stack1.pop();
            }
        }
        return String.valueOf(stack).equals(String.valueOf(stack1));
    }
}
