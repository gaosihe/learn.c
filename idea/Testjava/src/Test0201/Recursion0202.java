package Test0201;
public class Recursion0202 {
    public static void main(String[] args) {
        //Recursion(6);
        //Recursion01(10);
        //Recursion02(12345);
        //Hanoi(5,'1','2','3');
        //JumpFloor(7);
    }

    public static int Recursion(int k) {
        int num = 1;
        if (k == 1) {
            num = 1;
        }
        if (k > 1) {
            num = k * Recursion(k - 1);
        }
        System.out.println(num);
        return num;
    }
    public static int Recursion01(int k) {
        int num=0;
        if (k==1)
            num=1;
        if (k>1)
         num=k+Recursion01(k-1);
        System.out.println(num);
        return num;
    }

    public static int Recursion02(int k) {
        int num=0;
        if (k<10){
           return k;
        }
        else {
            num= k % 10 + Recursion02(k / 10);
            System.out.println(num);
            return num;
        }
    }

    public static void Hanoi(int n,char A,char B,char C) {//汉诺塔
        if (n == 1) {
            move(A, C);
        } else {
            Hanoi(n - 1, A, C, B);
            move(A, C);
            Hanoi(n - 1, B, A, C);
        }
    }

    public static void move(char A,char C) {
        System.out.println(A+"-->"+C);
    }

    public static int JumpFloor(int k) {//青蛙跳台阶
        int num=0;
        if (k==1){
           return 1;
        }
        if(k<3) {
            return k;
        }
        else
            num=JumpFloor(k-1)+JumpFloor(k-2);
        if(k==7)
        System.out.println(num);
        return num;
    }
}
