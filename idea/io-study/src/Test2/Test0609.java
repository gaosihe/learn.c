package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a > 1000) {
                a = 999;
            }
            List<Integer> list = new ArrayList<>();
            int i = 0;
            for (i = 0; i < a; i++) {
                list.add(i);
            }
            while (list.size() > 1) {
                    i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
