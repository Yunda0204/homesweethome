package exam02;

public class asd {
    public static void main(String[] args) {
        int initialMoney = 200_000; // 시작 금액
        int targetMoney = 100_000_000; // 목표 금액
        int consecutiveWins = 0; // 연승
        int totalMoney = initialMoney; // 소지한 돈

        while (totalMoney < targetMoney) {
            consecutiveWins++; // 딴 금액이 목표금액보다 낮을때마다 연승 증가
            totalMoney *= 2; // 그때마다 소지한 돈 *2
        }

        System.out.println("필요한 연승: " + consecutiveWins);
    }
}
