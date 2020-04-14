package Test0407;

import java.util.Comparator;

class Card implements Comparable<Card> {
    public String rank;//点数
    public String suit;//花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        //按照值来比较this和obj
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        //obj这个类型是否为Card的类型
        if (!(obj instanceof Card)) {
            return false;
        }
        //比较内容
        Card other = (Card) obj;
        return this.rank.equals(other.rank) && this.suit.equals(other.suit);
    }


    @Override
    public int compareTo(Card o) {
        //如果this比o小返回小于<0
        //===============大于0
        //相等============,返回0
        if(o==null){
            return 1;
        }
        int rank1=this.getValue();
        int rank2=o.getValue();
        return rank1 - rank2;
    }

    public int getValue() {
        int value = 0;
        if ("J".equals(rank)){
            value = 11;
        }else if ("Q".equals(rank)){
            value = 12;
        }else if ("K".equals(rank)){
            value = 13;
        }else if ("A".equals(rank)){
            value = 14;
        }else {
            value = Integer.parseInt(rank);
        }
        return value;
    }
}
class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if (o1 == o2){
            return 0;
        }
        if (o1 == null){
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        int value1 = o1.getValue();
        int value2 = o2.getValue();
        return value1-value2;
    }
}
public class Test0413 {
    public static void main(String[] args) {
        Card p = new Card("3","♠");
        Card q = new Card("3","♠");
        Card o=p;
//        System.out.println(p==o);
//        System.out.println(p==q);
//
//        System.out.println("=============");
//        System.out.println(p.equals(o));
//        System.out.println(p.equals(q));
        System.out.println(p.compareTo(q));
        System.out.println(p.compareTo(o));
        CardComparator comparator = new CardComparator();
        System.out.println(comparator.compare (p,q));

    }
}
