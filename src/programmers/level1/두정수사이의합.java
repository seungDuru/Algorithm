package programmers.level1;

public class 두정수사이의합 {

    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if(max == min) {
            return max;
        } else {
            for(int i = min; i <= max; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public static long solution2(int a, int b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
