package main.Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayMinSort0812 {
    public static void main(String[] args) {
        int [] arr={3,32,321};
        int a = Integer.valueOf(PrintMinNumber(arr));
        System.out.println(a);
    }
    public static String PrintMinNumber(int [] numbers) {
        if(numbers == null){
            return new String();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int e : numbers){
            list.add(e);
        }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer x, Integer y){
                String xs = x + "" + y;
                String ys = y + "" + x;
                return xs.compareTo(ys);
            }
        });
        String result = new String();
        for(Integer e : list){
            result += e;
        } return result;
    }
}