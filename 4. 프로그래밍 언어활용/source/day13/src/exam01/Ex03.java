package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[][] nums1 = {{10, 20, 30}, {40, 50, 60}};
        int[][] nums2 = {{10, 25, 30}, {40, 50, 60}};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.deepToString(nums1));
        System.out.println(Arrays.equals(nums1, nums2));
    }
}
