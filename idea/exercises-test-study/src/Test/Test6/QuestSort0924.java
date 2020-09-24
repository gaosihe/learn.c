package Test.Test6;

public class QuestSort0924 {
    public static void main(String[] strings){
        int arr[] = {5,2,6,32,35,6};
        myQuestSort(arr,0,arr.length-1);
        for (int a: arr){
            System.out.print(a+" ");
        }
    }

    private static void myQuestSort(int[] arr,int start,int end) {
        if (start > end)
            return;

        int left = start;
        int right = end;
        int temp = arr[left];
        while (left<right){
            while (arr[left]<temp&&left<right){
                left++;
            }
            while (arr[right]>temp&&left<right){
                --right;
            }
            if (left<right&&arr[left]==arr[right]){
                left++;
            }
            else{
                temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
            }
        }
        myQuestSort(arr,start,left-1);
        myQuestSort(arr,right+1,end);
    }
}
