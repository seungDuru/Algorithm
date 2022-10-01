package programmers.level1;

import java.util.Arrays;

public class 없는숫자구하기 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};

        System.out.println(solution2(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        boolean[] checkNum = new boolean[10];

        for(int num : numbers) {
            checkNum[num] = true;
        }

        for(int i = 0; i < checkNum.length; i++) {
            if(!checkNum[i]) {
                answer += i;
            }
        }

        return answer;
    }

    public static int solution2(int[] numbers) {
        return 45- Arrays.stream(numbers).sum();
    }
}
