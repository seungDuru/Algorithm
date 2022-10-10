package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.parseLong(String.join("", arr));
    }
}
