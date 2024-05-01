package exam02;

public class qwe {
    public static void main(String[] args) {
        int Wins = 0; // 연승횟수
        int totalMoney = 200000; // 시작 금액
        int targetMoney = 100000000; // 목표금액

        while (totalMoney < targetMoney) {
            Wins++; // 소지금액이 목표보다 작을때마다 1승 추가
            totalMoney *= 2; // 그때 소지금액 *2
        }

        // 승률 50퍼 * 필요연승 = 9연승 확률
        double probability = Math.pow(0.5, Wins);

        System.out.println("필요 연승 : " + Wins);
        System.out.println("연승 확률 : " + probability);
    }
}
