package Test0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestStackAndQueue0331 {
    public static void main(String[] args) {
        String s="([])";
        final boolean valid = (boolean) isValid(s);
        System.out.println(valid);
    }
    public static boolean isValid(String s){//判断括号是否匹配
        //1.先创建一个栈.保存字符类型
        Map<Character,Character>map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        Stack<Character> stack = new Stack<>();
        //2.循环遍历每个字符
        for (int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            //3.判定c是否是左括号,如果c是左括号,就入栈
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;//进入下次循环
            }
            if (stack.empty()){//如果发现当前字符不是左括号,并且栈又为空,此时说明字符非法
                return false;
            }
            //4.判定c是否是右括号,如果是,就取出栈顶元素比较一下
            char top = stack.pop();
//            //1),合法情况一
//            if (top =='('&&c==')'){
//                continue;
//            }//1),合法情况2
//            if (top =='['&&c==']'){
//                continue;
//            }//1),合法情况2
//            if (top =='{'&&c=='}'){
//                continue;
//            }
            //除了上面三种其他的都是不合法的
            if (map.get(top)==c){
                continue;
            }
            return false;
        }
        if (stack.empty()){
            return true;
        }
        //遍历完字符串之后,判断栈是否为空
        return false;
    }
}
