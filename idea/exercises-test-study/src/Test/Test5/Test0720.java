package Test.Test5;

import java.util.*;

public class Test0720 {

    //res用于保存结果集
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    //list输出的是每一行的结果
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            dfs(1, m, n);

            //打印结果集
            for(ArrayList<Integer> l : res) {
                int i = 0;
                for(; i < l.size()-1; i++) {
                    System.out.print(l.get(i) + " ");
                }
                System.out.println(l.get(i));
            }
        }
    }

    //核心逻辑在此：求n个数中和为m的数的集合
    public static void dfs(int index, int count, int n) {
        if(count == 0) {
            res.add(new ArrayList<>(list));
        }else {
            for(int i = index; i <= count && i <= n; i++) {
                list.add(i);
                dfs(i+1, count-i, n);
                list.remove(list.size()-1);
            }
        }
    }
}