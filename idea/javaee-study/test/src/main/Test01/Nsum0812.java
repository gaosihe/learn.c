package main.Test01;

public class Nsum0812 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(99));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        int dight = 1,high = n/10,low = 0,cur = n%10;
        while(high!=0 || cur!=0){
            if(cur == 0){
                res+=high*dight;
            }else if(cur == 1){
                res+=(high*dight+low+1);
            }else{
                res+=(high+1)*dight;
            }
            cur = high%10;
            high/=10;
            dight*=10;
            low = n%dight;
        }
        return res;
    }
}
