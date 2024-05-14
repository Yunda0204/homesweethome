package exam03;

public class Card {
    private static int num;
    private int cardNum;
    private String holder;

    public Card(String holder) {
        this.holder = holder;
        cardNum = ++num;
    }

    public String toString() {
        return String.format("카드번호 : %d, 카드소유자 : %s%n", cardNum, holder);
    }

    public static void main(String[] args) {
        Card card1 = new Card("윤다은");
        Card card2 = new Card("채도아");
        Card card3 = new Card("도선화");

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }

    }
