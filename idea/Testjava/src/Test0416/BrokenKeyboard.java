package Test0416;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyboard {
    public static void main(String[] args) {//坏掉的键
        //1.循环读入预期的字符串和输出的字符串
        //2.吧两个字符串转成大写
        //3.题目中的主要任务是判定预期输出的那些字符在实际输出的字符串中不存在
        //4.用set吧字符串存进去
        //最后对坏掉的键进行去重<set>
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String expected = scanner.next();
            String actual =scanner.next();
            //存字符串转大写
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            //创建set保存实际输出字符
            Set<Character> actualSet = new HashSet<>();
            for (int i = 0;i<actual.length();i++){
                //set中的元素不能重复add时若存在,则会失败
                actualSet.add(actual.charAt(i));
            }
            //4.遍历预期输出的字符串,找出坏掉的键
            Set<Character> brokenKeySet = new HashSet<>();
            for (int i = 0; i < expected.length();i++){
                char c = expected.charAt(i);
                if (actualSet.contains(c)){
                    continue;
                }
                //没找到就是坏了的键
                //输出格式很重要,
                //坏键去重
                if (brokenKeySet.contains(c)){
                    //这里的brokenKeySet用于辅助去重,防止坏键多次打印
                    continue;
                }
                System.out.print(c);
                brokenKeySet.add(c);
            }
        }//end while
    }
}






