package programmers.level1;

public class 제곱근판별 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(solution(3));

    }

    public static long solution(long n) {
        long sqrt = (long)Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            return (long)Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}
