package programmers.level1;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));

    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for(int a : d) {
            if(a <= budget) {
                budget -= a;
                answer++;
            }
        }

        return answer;
    }
}
