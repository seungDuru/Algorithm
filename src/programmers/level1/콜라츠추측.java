package programmers.level1;

public class 콜라츠추측 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(626331));
    }

    public static int solution(long num) {
        int answer = 0;
        while(num != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }

            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}
