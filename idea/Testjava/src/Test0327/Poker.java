package Test0327;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//表示一张牌
class Card{
    private String rank;//点数
    private String suit;//花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "rank='" + rank + '\'' +
//                ", suit='" + suit + '\'' +
//                '}';
        return "【"+this.rank+this.suit+"]";
    }
}
public class Poker {
    public static void main(String[] args) {
        //1.创建一副牌
        List<Card> poker = buyPoker();
        //2.洗牌 使用Collections.shuffle方法随机打乱顺序;
        //System.out.println(poker);
        Collections.shuffle(poker);
        //3.发牌,假设有三个玩家,每人发五张牌
        //每个玩家就是一个List,可以把每个人的手牌发到这个List上面
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        //给三个玩家,每人发五张牌
        for(int i = 0;i<5 ; i++){
            for (int j = 0;j < 3; j++){
                List<Card>player = players.get(j);
                player.add(poker.remove(0));
            }
        }
        for(int i = 0; i< 3; i++){
            System.out.println("玩家"+ i +":"+players.get(i));
        }
    }

    private static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥", "♠", "♣", "♦"};
        for (int i = 0; i < 4; i++) {
            //处理四种花色的十三张牌
            for (int j = 2; j <= 10; j++) {
                //String.valueOf
                poker.add(new Card("" + j, suits[i]));
            }
            poker.add(new Card("J", suits[i]));
            poker.add(new Card("Q", suits[i]));
            poker.add(new Card("K", suits[i]));
            poker.add(new Card("A", suits[i]));
        }
            return poker;
    }
}