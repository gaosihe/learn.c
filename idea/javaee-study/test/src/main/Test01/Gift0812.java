package main.Test01;

public class Gift0812 {
    /**
     *
     * @param args int整型二维数组 N*M的矩阵，每个元素是这个地板砖上的礼物体积
     * @return int整型
     */
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {2,3,4}
        };
        System.out.println(selectPresent(arr1));

    }
    public static int selectPresent (int[][] presentVolumn) {
        if(presentVolumn==null || presentVolumn.length == 0)return 0;
        // write code here
        int M = presentVolumn[0].length;
        int N = presentVolumn.length;
        int [][] arr =presentVolumn.clone();
        for (int i = 1;i<N;i++){
            arr[i][0] = arr[i][0]+arr[i-1][0];
        }
        for (int i = 1;i<M;i++){
            arr[0][i] = arr[0][i]+arr[0][i-1];
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                arr[i][j] += Math.min(arr[i-1][j],
                        Math.min(arr[i][j-1],arr[i-1][j-1]));
            }
        }
        return arr[N-1][M-1];
    }
}