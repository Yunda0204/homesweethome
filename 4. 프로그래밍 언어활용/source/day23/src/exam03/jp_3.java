package exam02;

public class Lotto {
    public static void main(String[] args) {
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            int luck = (int) (Math.random() * 46) + 1;
            num[i] = luck;

            for (int k = 0; k < i; k++) {
                if (num[i] == num[k]) {
//                    break;
                }
            }
            System.out.println(num[i]);
        }
    }
}
/*
 중복검사를 어떻게 할 것이냐
 중복 for문을 활용할거다
 if로 중복검사를 할거다
 숫자가 같다면 같은 숫자는 갖다 치우고 다시만들어야지

 */
