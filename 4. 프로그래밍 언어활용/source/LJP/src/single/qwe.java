package single;

import java.util.Scanner;

public class qwe {
    public static String solution(String str1, String str2) {
        // StringBuilder 객체 생성
        StringBuilder combinedStr = new StringBuilder();
        // 두 문자열의 길이가 같다는 조건이 주어졌으므로 한 문자열의 길이만큼 반복
        for (int i= 0;i<str1.length();i++){
            combinedStr.append(str1.charAt(i)).append(str2.charAt(i));
        } //지정된 인덱스의 char값을 반환함
        return combinedStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 첫 번째 문자열 입력 받기
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();

        // 사용자로부터 두 번째 문자열 입력 받기
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();

        // solution 함수를 사용하여 결과 계산
        String result = solution(str1, str2);

        System.out.println("result: " + result);

        scanner.close();
    }
}
