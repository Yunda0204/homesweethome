package Q;

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {21, 22, 30, 11, 99, 31};

        int s = 0;
        int e = arr.length - 1; // 배열 length는 0부터 시작이니 -1


        while (s < e) { // s가 e보다 작을때까지
            int tmp = arr[s]; //  tmp에 첫번째 번호 넣고
            arr[s] = arr[e]; // 첫번째에 arr의 마지막 length 넣고
            arr[e] = tmp; // e에 tmp, 즉 첫번쨰 번호 넣고

            s++; // s는 1씩 증가
            e--; // e는 1씩 감소
        }

        System.out.println("Yunda03: " + Arrays.toString(arr));
    }
}


