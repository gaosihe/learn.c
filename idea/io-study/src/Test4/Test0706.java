package Test4;

import java.util.*;

public class Test0706{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            int index = s.lastIndexOf("\\");
            if(index!=-1){
                s=s.substring(index+1);
            }
            if(map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
            Set<String> set =map.keySet();
            int count = 0;
            for(String tmp : set){
                count++;
                if(count<set.size()-8){
                    String[] s1 = tmp.split(" ");
                    String file = s1[0];
                    int len = file.length();
                    if(len>16){
                        file = file.substring(len-16);
                    }
                    int line =Integer.parseInt(s1[1]);
                    int number = map.get(tmp);
                    System.out.print(file+" "+line+" "+number);
                }
            }
        }
    }
}