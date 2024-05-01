package Q;

import java.util.Arrays;

public class q5_1 {
    public static void main(String[] args) {
        int[] arr = {21,22,30,11,99,31};
        int[] arr2 = new int[6];

        for (int i = arr.length - 1, j = 0; i>=0; i--,j++){
            arr2[j] = arr[i];
        }
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arr2 : " + Arrays.toString(arr2));
    }
}
