package programmers.level1;

public class 약수의개수와덧셈 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(solution(13,17));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }
            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
}
