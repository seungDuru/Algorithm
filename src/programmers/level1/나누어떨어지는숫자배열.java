package programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 나누어떨어지는숫자배열 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {3,2,6};
        int divisor = 10;
        for(int a : solution(arr, divisor)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .filter(f -> f % divisor == 0)
                .mapToInt(c->c)
                .sorted()
                .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    public static int[] solution2(int[] arr, int divisor) {
        return Arrays.stream(arr)
                .filter(f -> f % divisor == 0)
                .toArray();
    }
}
