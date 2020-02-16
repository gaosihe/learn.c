package Test0204;

public class evalRPN0216 {
    public static void main(String[] args) {
        String[] s = {"2","1","+","3","*"};
        int [] ss={1,3,5,2,4,6,7};
        System.out.println(evalRPN(s));
        System.out.println(findUnsortedSubarray(ss));
    }
        public static int evalRPN(String[] tokens) {//逆波兰表达式求值
            int[] stack = new int[tokens.length];
            int k= -1;
            for(String s : tokens) {
                switch(s) {
                    case "+":
                        stack[k-1] += stack[k];
                        k--;
                        break;
                    case "-":
                        stack[k-1] -= stack[k];
                        k--;
                        break;
                    case "*":
                        stack[k-1] *= stack[k];
                        k--;
                        break;
                    case "/":
                        stack[k-1] /= stack[k];
                        k--;
                        break;
                    default:
                        stack[++k] = Integer.parseInt(s);
                }
            }
            return stack[0];
        }
        public static int findUnsortedSubarray(int[] nums) {//最短无序连续子数组
            int len = nums.length;
            int max = nums[0];
            int min = nums[len-1];
            int l = 0, r = -1;
            for(int i=0;i<len;i++){
                if(max>nums[i]){
                    r = i;
                }else{
                    max = nums[i];
                }
            }
            for(int i=len-1;i>=0;i--){
                if(min<nums[i]){
                    l = i;
                }else{
                    min = nums[i];
                }
            }
            return r-l+1;
        }
}
