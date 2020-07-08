package Test4;

public class Count0707 {
    public static int countNumberOf2s(int n) {
        int count = 0; //计算2的总个数  以12209为例，计算百位数时2的个数
        int low = 0; //计算低位  此时低位为09
        int current = 0; //计算当前位 此时当前位为2
        int high = 0; //计算高位  此时高位为12
        int flag = 1; //标记此时是个位数1、十位数10还是百位数100    此时flag为100
        while (n / flag != 0) {  //n=12209  计算百位  则low为十位数个位数    current为百位数   high为百位数前面的数
            low = n - (n / flag) * flag;  //12209-(12209/100)*100=12209-12200*100=12209-12200=09
            current = (n / flag) % 10;    //(12209/100)%10=122%10=2
            high = (n / flag) / 10;       //(12209/100)/10=122/10=12
            if (current == 1 || current == 0) {  //当前位 < 2的情况
                count += high * flag;  //高位*flag
            } else if (current == 2) {  //当前位 = 2的情况
                count += high * flag + low + 1;
            } else {  //当前位 > 2的情况
                count += (high + 1) * flag;
            }
            flag *= 10;

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 99;
        int a = countNumberOf2s(n);
        System.out.println(a);
    }
}
