package programmers.level1;

import java.util.Arrays;

public class 제일작은수제거하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr)
                .filter(f -> f > Arrays.stream(arr).min().getAsInt())
                .toArray();
        return answer.length == 0 ? new int[] {-1} : answer;
    }
}
