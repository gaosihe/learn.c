package Test.Test5;


    import java.util.ArrayList;
import java.util.Collections;
public class PaiLie0726 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(Permutation(s));
    }
        public static void Swap(char[] str, int i, int j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        public static boolean IsExist(ArrayList<String> result, char[] str){
            return result.contains(String.valueOf(str));
        }
        public static void PermutationHelper(char[] str, int start, ArrayList<String>
                result){
            if(start == str.length - 1){
                if(!IsExist(result, str)){
                    result.add(new String(str));
                }
                return;
            }
            for(int i = start; i < str.length; i++){
                Swap(str, start, i);
                PermutationHelper(str, start+1, result);
                Swap(str, start, i);
            }
        }
        public static ArrayList<String> Permutation(String str) {
            ArrayList<String> result = new ArrayList<>();
            if(str != null && str.length() > 0){
                PermutationHelper(str.toCharArray(), 0, result);
                Collections.sort(result);
            }
            return result;
        }
    }
