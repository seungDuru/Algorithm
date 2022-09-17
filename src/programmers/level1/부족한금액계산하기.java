package programmers.level1;

public class 부족한금액계산하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++) answer += price*i;
        return answer = answer <= money ? 0 : answer - money;
    }
}
