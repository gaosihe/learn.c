class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        int s1 = s.length();
        for(int i= 0;i<s1;i++){
            res^=s.charAt(i)^t.charAt(i);
        }
        res^= t.charAt(s1);
        return res;
    }
}