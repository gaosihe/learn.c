package Test1;

import java.util.Scanner;
public class Test0606 {

        static int count = 0;
        static int[] arr;
        static int n ;
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            while (s.hasNext())
            {
                n = s.nextInt();
                arr = new int[n+1];
                for (int i=1; i<=n; ++i)
                {
                    arr[i] = s.nextInt();
                }
                beibao(40, n);
                System.out.println(count);
            }
        }


//          s 表示背包剩下的容量大小
//          n 表示剩下的东西数量

        public static void beibao (int s, int n)
        {

//       如果背包容量刚好等于零，说明刚好装满
            if (s == 0)
            {
                count ++;
            }
//        背包容量小于零或者容量大于零但是东西数量小于零，则不能刚好装满
            if (s<=0 || (s>0 && n<0))
            {
                return;
            }
//        从最后一个开始装
            beibao(s-arr[n], n-1);
//        如果最后一个和其他是都值完了，从倒数第二个开始
            beibao(s, n-1);
        }
    }
