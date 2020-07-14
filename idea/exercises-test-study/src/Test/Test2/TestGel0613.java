package Test.Test2;

public class TestGel0613 {
    public static void main(String[] args) {
        String[] s = getGray(4);
        for (int i = 0;i<s.length; i++){
            System.out.println(s[i]);
        }
    }
        public static String[] getGray(int n) {
            if(n==1){
                return new String[]{"0","1"};
            }
            String[] s1=getGray(n-1);//递归调用
            String[] s2=new String[2*s1.length];
            for(int i=0;i<s1.length;i++){
                s2[i]="0"+s1[i];//首位添加0
                s2[i+s1.length]="1"+s1[s1.length-1-i];//首位添加1，注意需要顺序反向
            }
            return s2;
        }
    }
