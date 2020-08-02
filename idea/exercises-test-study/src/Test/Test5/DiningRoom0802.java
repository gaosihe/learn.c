package Test.Test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DiningRoom0802 {
        public static void main(String[] args){//餐厅
            Scanner sc  = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();  // n table
                int m = sc.nextInt();  // m customers
                int[] table = new int[n];
                for(int i=0;i<n;i++)
                    table[i]=sc.nextInt();  // volume of a table

                int[][] cus = new int[m][2];
                for(int j=0;j<m;j++){
                    cus[j][0]=sc.nextInt(); // number of customers
                    cus[j][1]=sc.nextInt(); // money
                }

                Arrays.sort(table);
                Arrays.sort(cus, new Comparator<int[]>(){

                    public int compare(int[] a, int[] b){

                        return b[1]-a[1];

                    }
                });

                long res = 0L;
                int index = 0;
                boolean[] tableb = new boolean[n];
                for(int i=0;i<m;i++){
                    if(cus[i][0]>table[n-1])
                        continue;
                    index = bs(table,cus[i][0]);
                    while(index<n && tableb[index]==true)
                        index++;
                    if(index<n){
                        res += cus[i][1];
                        tableb[index]=true;
                    }
                }

                System.out.println(res);
            }
            sc.close();
        }

        private static int bs(int[] num, int tar){
            int low=0;
            int high=num.length-1;
            int mid=0;
            while(low<=high){
                mid=(high+low)>>1;
                if(num[mid]>=tar)
                    high=mid-1;
                else
                    low=mid+1;
            }

            return low;
        }
}
