package Test.Test5;

public class ClockwisePrinting0726 {
    public static int[] printMatriClockwisely(int[][] numbers, int rows, int cols){
        //将整个矩阵一圈一圈打印，起点的横纵坐标值相等
        if (numbers == null || rows <= 0 || cols <= 0)
            return new int[0];
        int[] arr  = new int [9];
        int k= 0;
        int start = 0;
        while(rows > 2 * start && cols > 2 * start){
            printMatriInOrder(numbers, rows, cols, start,arr,k);
            start ++;
        }
        return arr;
    }

    private static void printMatriInOrder(int[][] numbers, int rows,
                                          int cols, int start,int[] arr,int k){
        //打印一圈
        int endX = cols - start - 1;
        int endY = rows - start - 1;
        //向右,至少一列
        if (start <= endX){
            for (int i = start; i <= endX; i ++){
                arr[k++]=numbers[start][i];
            }
        }
        //向下，至少两行
        if (start < endY){
            for (int i = start + 1; i <= endY; i ++)
                arr[k++]=numbers[i][endX];
        }
        //向左，至少两行两列
        if (start < endX && start < endY){
            for (int i = endX - 1; i >= start; i --)
                arr[k++]=numbers[endY][i];
        }
        //向上，至少三行两列
        if (start < endX && start < endY - 1){
            for (int i = endY - 1; i > start; i --)
                arr[k++]=numbers[i][start];
        }
    }

    //测试用例
    public static void main(String[] args){
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] a1 = ClockwisePrinting0726.printMatriClockwisely(numbers, 3, 3);

        for(int i:a1){
            System.out.println(i);
        }
    }
}
