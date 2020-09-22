package Test.Test6;

public class Tests0922 {
    public int sort (String inData) {
        // write code here
        String[] s1 = inData.split(" ");
        int[] array = new int[s1.length];
        for (int i= 0 ;i<s1.length;i++){
            array[i] = Integer.parseInt(String.valueOf(s1[i]));
        }
        int count = 0;
        for (int i = 0;i<array.length -1;i++){
            int minIndex = i;
            int min = array[i];
            for (int j = i+1;j< array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                    min =array[j];
                    count++;
                }
            }
            if (minIndex!= i){
                array[minIndex] =array[i];
                array[i] = min;
            }
        }
        return count;
    }
}
