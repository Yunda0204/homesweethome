package exam01;

public class qwe {
    public static void main(String[] args) {
        int Money = 200_000; // 시작 금액
        int targetMoney = 100_000_000; // 목표 금액
        int continuitywins = 0; // 연승
        int totalMoney = Money; // 소지한 돈

        while (totalMoney < targetMoney) {
            continuitywins++; // 딴 금액이 목표금액보다 낮을때마다 연승 증가
            totalMoney *= 2; // 그때마다 소지한 돈 *2
        }

        System.out.println("필요한 연승: " + continuitywins);
    }
}


