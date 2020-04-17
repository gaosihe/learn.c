package Test0416;

import java.util.*;

public class MapInterview0416 {
    static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head){//拷贝一个链表
        //1.遍历旧链表,每个节点依次插入到map中,kay是旧链表结点,value是拷贝的新链表
        Map<Node,Node> map = new HashMap<>();
        for (Node cur = head;cur!=null;cur = cur.next){
            map.put(cur,new Node(cur.val));
        }
        //2.再次遍历链表
        for (Node cur = head;cur!=null;cur = cur.next){
            //先从map中找到cur对应的新链表结点
            Node newCur = map.get(cur);
            newCur.next = map.get(cur.next);
            newCur.random = map.get(cur.random);
        }
        return map.get(head);
    }

    public int numJewelsInStone(String J,String S){//找到宝石
        Set<Character> set = new HashSet<>();
        for (char c :J.toCharArray()){
            set.add(c);
        }
        int ret = 0;
        for (char c :S.toCharArray()){
            if (set.contains(c)){
                ret++;
            }
        }
        return ret;
    }

    static class MyComparator implements Comparator<String>{
        private Map<String,Integer> map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            int count1=map.get(o1);
            int count2=map.get(o2);
            if (count1 == count2){
                //compareTo就是使用String默认的比较规则
                return o1.compareTo(o2);
            }
            //通过大小返回值,重新定义大小
            //coynt2-count1降序
            //count1-count2升序
            return count2-count1;
        }
    }

    public List<String> topKFrequent(String[] words,int k ){
        //先统计每个单词出现次数
        Map<String,Integer> map = new HashMap<>();
        for (String s:words){
            Integer count = map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        //2.把这里统计的字符串放到ArrayList中
        //keySet相当于得到了一个Set,Set中存放的就是所有的key
        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        //此处sort默认按照元素大小进行升序排序
        //此处我们需要按照字符串次数来降序排序,也就需要比较强自定制比较规则
        Collections.sort(arrayList,new MyComparator(map));
        return arrayList.subList(0,k);
    }
}











