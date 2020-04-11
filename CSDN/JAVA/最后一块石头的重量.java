class Solution {
        public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
            return stones[0];

        int index = stones.length - 1;  //每次操作最大数的下标
        Arrays.sort(stones);
        while(stones[index-1] != 0){    //第二大数等于0，说明已经完成
            int x = stones[index-1];
            int y = stones[index];
            if(x == y){
                stones[index] = stones[index-1] = 0;
            }else{
                stones[index-1] = 0;
                stones[index] = y - x;
            }
            Arrays.sort(stones);
        }
        return stones[stones.length-1];
    }
}