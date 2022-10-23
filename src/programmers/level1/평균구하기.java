package programmers.level1;

import java.util.Arrays;

public class 평균구하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
    
}
