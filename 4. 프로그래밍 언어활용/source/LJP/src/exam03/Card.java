package exam03;

public class Card {
    private static int lastCardNumber = -1;
    private int cardNumber;

    public Card() {
        // 객체가 생성 될떄마다 마지막 번호가 증가, 증가된 값이 새카드 번호로 할당
        this.cardNumber = ++lastCardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        System.out.println("카드1 : " + card1.getCardNumber());
        System.out.println("카드2 : " + card2.getCardNumber());
        System.out.println("카드3 : " + card3.getCardNumber());
    }
}