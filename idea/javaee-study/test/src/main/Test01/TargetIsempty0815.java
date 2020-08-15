package main.Test01;

public class TargetIsempty0815 {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0){
            return false;
        }
        int i = array[0].length;
        int j = array.length;
        int m = 0;
        int n = i-1;
        while(m<=j-1&&n>=0){

            if(array[m][n]> target){
                n--;
            }
            else if(array[m][n]<target){
                m++;
            }
            else if(array[m][n]== target){
                return true;
            }
        }
        return false;
    }
}