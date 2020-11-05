package Test0514;


public class Test0905 {
    public static void main(String[] args) {
        for (int i = 1;i<1000;i++){
            char[] a = String.valueOf(i).toCharArray();
            boolean b = false;
            for(char c: a){
                if (c=='5'){
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.println(i);
            }
        }
    }
}
