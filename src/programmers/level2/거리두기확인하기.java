package programmers.level2;

import java.util.Arrays;

public class 거리두기확인하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers));
    }


    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        for(String s : arr) {
            answer += s;
        }

        return answer;
    }
}
