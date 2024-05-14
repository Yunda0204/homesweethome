package exam02;

public class qwewq {
    public static void main(String[] args) {

    int win = 0;
    int money = 200_000;
    int taget = 100_000_000;

        while (money < taget) {
            win++;
            money *= 2;
        }

        double percent = Math.pow(0.5, win) * 10;
        System.out.println(win);
        System.out.println(money);
        System.out.println(percent);
    }


    }
