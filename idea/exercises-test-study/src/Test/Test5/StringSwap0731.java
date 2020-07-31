package Test.Test5;

public class StringSwap0731 {
    public static void main(String[] args) {
        String s ="I am JAVA";
        System.out.println(ReverseSen(s));
    }
    public static String ReverseSen(String str){
        if (str == null||str.length() == 0){
            return str;
        }
        char[] list =str.toCharArray();
        int len = list.length;
        int i = 0;
        int j = 0;
        while (i<list.length){
            while (i < len&&!Character.isSpace(list[i])) i++;
            Reverse1(list,j,i-1);
            while (i<len&& Character.isSpace(list[i])) i++;
            j = i;
        }
        Reverse1(list,j,i-1);
        Reverse1(list,0,len-1);
        return new String(list);
    }

    private static void Reverse1(char[] list, int start, int end) {
        while (start<end){
            char temp = list[start];
            list[start] = list[end];
            list[end] =temp;
            start++;
            end--;
        }
    }
}
