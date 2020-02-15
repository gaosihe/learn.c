package Test0204;

public class isPalindrome0215 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        char [] a={'a','a','v','v','b'};
        System.out.println(compress(a));
    }
    public static boolean isPalindrome(String s) {//验证回文串
        char[] cs = s.toCharArray();
        int cnt = 0, j = 0;
        for (int i = 0; i < cs.length; i++) {
            if (('0' <= cs[i] && cs[i] <= '9') || ('a' <= cs[i] && cs[i] <= 'z')) {
                cs[cnt++] = cs[i];
            } else if ('A' <= cs[i] && cs[i] <= 'Z') {
                cs[cnt++] = (char) (cs[i] - 'A' + 'a');
            }
        }
        cnt--;
        while (j < cnt) if (cs[j++] != cs[cnt--]) return false;
        return true;
    }
    public static int compress(char[] chars) {//压缩字符串
        int t=0;//设置指针
        int i=0;
        while (i <chars.length && t<chars.length) {//遍历字符串
            chars[t++]=chars[i];//取相同字符序列的首字符存下
            int temp=i;//记录相同字符序列首元素位置
            while (i<chars.length &&chars[i]==chars[t-1])
                i++;//i指针滑动到相同字符序列末尾的下一个位置
            if(i-temp>1){//若相同字符序列长度大于1
                for(char c:String.valueOf(i-temp).toCharArray()){
                    //向结果中加入相同字符序列的长度的字符形式
                    chars[t++]=c;
                }
            }
        }
        return t;//t即为已压缩的结果的长度
    }
}
