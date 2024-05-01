package 다른패키지;

public class qweqweqw {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        // 배열 뒤집기
        int length = nums.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i - 1] = temp;
        }

        // 뒤집힌 배열 출력
        System.out.print("Reversed array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


