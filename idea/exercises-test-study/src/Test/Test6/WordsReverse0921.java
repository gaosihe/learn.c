package Test.Test6;

public class WordsReverse0921 {
    public static void main(String[] args) {
        String s =  new String();
        s = " i love3 love china china3 ";
        wordreverse(s);
    }

    private static void wordreverse(String s) {
        s = s.trim();
        StringBuffer stringBuffer = new StringBuffer();
        String s1[] = s.split(" ");
        int left = 0;
        int right = s1.length-1;
        while (left<right){
            if (isword(s1[left])){
                left++;
                continue;
            }
            if (isword(s1[right])){
                right--;
                continue;
            }
            String temp = s1[left];
            s1[left] = s1[right];
            s1[right] =temp;
            left++;
            right--;
        }
        for (String str :s1){
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        s = stringBuffer.toString().trim();
        System.out.println(s);
    }

    private static boolean isword(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars){
            if (c<'a'||c>'z'){
                return true;
            }
        }
        return false;
    }
    }
