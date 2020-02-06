package Test0204;

public class isPalindrome0206 {
    public static void main(String[] args) {
        String a="aa";
        String b="aab";
        //System.out.println(canConstruct(a,b));
        System.out.println(isPalindrome(23532));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {//赋金信
        int[] num=new int[26];
        for(int i=0;i<magazine.length();i++){
            num[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(num[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            num[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
        public static boolean isPalindrome(int x) {//判断回文数
            if (x < 0 || (x % 10 == 0 && x != 0)) return false;
            int num1=0;
            while(x>num1){
                num1=num1*10+x%10;
                x=x/10;
            }
            return x==num1||x==num1/10;
        }
}
