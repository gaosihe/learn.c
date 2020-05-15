class Solution{
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i<n ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.get(c1) == null){
            if(map.containsValue(c2)){//判断Value中是否有c2
                return false;
            }
            map.put(c1,c2);//为空将c1,c2加入map
            }else if(map.get(c1)!= c2){//判断这里的c1对应的c2是否和map存储的相等
            return false;
                    }
                }
        return true;
    }
}