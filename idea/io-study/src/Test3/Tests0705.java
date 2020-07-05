package Test3;


import java.util.*;
public class Tests0705{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<String> list = new ArrayList<String>();
            for(int i = 0;i<n;i++){
                String s = sc.next();
                list.add(s);
            }
            sortNumber(list);
        }
    }
    public static void sortNumber(ArrayList<String> list){
        Comparator<String> c = new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                if(o1.length()>o2.length())
                    return 1;
                else if(o1.length()==o2.length()){
                    for(int i = 0;i<o1.length();i++){
                        int temp1=(int)o1.charAt(i);
                        int temp2=(int)o2.charAt(i);
                        if(temp1>temp2){
                            return 1;
                        }else if(temp1<temp2){
                            return-1;
                        }
                    }
                    return -1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list,c);
        for(int i = 0;i < list.size();i++){
            System.out.printf("%s%n",list.get(i));
        }
    }
}
