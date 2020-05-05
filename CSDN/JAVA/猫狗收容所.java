import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {//猫狗收容所
        // write code here  
        ArrayList<Integer> input = new ArrayList<Integer>();//存放进入的动物
        ArrayList<Integer> output = new ArrayList<Integer>();//存放收养的动物
        int rows = ope.length;
        for(int i = 0;i< rows; i++){
            switch(ope[i][0]){
                case 1:
                    input.add(ope[i][1]);
                    //存进的动物
                    break;
                case 2:
                    //第一种收养方式
                    if(ope[i][1]==0){
                        for(int j = 0;j<input.size() ;j++){
                            if(input.get(j)!=0){//找到收容所符合的动物
                                output.add(input.get(j));//加入收养的数组
                                input.set(j,0);//将被收养的位置置为0
                                break;
                            }
                        }
                    }else if(ope[i][1]==1){//收养狗
                        for(int j = 0;j<input.size() ;j++){
                            if(input.get(j)>0){
                                output.add(input.get(j));
                                input.set(j,0);
                                break;
                            }
                        }
                    }else{//收养猫
                        for(int j = 0;j<input.size() ;j++){
                            if(input.get(j)<0){
                                output.add(input.get(j));
                                input.set(j,0);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        return output;
    }
}