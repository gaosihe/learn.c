package Test.Test6;

import java.util.Scanner;

/*字符串转整体（StrToInt），即类似于atoi库函数，规则如下：

 1、该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止

 2、当找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数

 3、该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响

 4、假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。

 5、在任何情况下，若函数不能进行有效的转换时，请返回 0。

 注意：

 1、不能使用 atoi 或者其他类似的库函数

 2、假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−2^31,  2^31 − 1]。如果数值超过这个范围，请返回  INT_MAX (2^31 − 1) 或 INT_MIN (−2^31)
*/
 public class MeiCai0916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            if (s == null||s.length()==0){
                return;
            }
            char[] s1 = s.toCharArray();
            int i = 0;
            for (;i<s1.length;i++){
                if (s1[i]!=' ')
                    break;
            }
            String res = "";
            boolean stg = false;
            int j = i;
            while (i<s1.length){
                if (s1[i] == '-'&& !stg && j==i) {
                    res+=String.valueOf(s1[i]);
                    stg = true;
                }else if (s1[i]>='0'&&s1[i]<='9'){
                    res+=String.valueOf(s1[i]);
                }
                i++;
            }
            System.out.println(res);
            int result = 0;
            try {
                result = Integer.parseInt(res);
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println(Integer.MAX_VALUE);
            }
        }
    }
}
