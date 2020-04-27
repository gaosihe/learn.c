class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for(String s : ops) {
            if (s.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(s));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
}