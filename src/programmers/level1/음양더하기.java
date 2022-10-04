package programmers.level1;

import java.util.Arrays;

public class 음양더하기 {

    public static void main(String[] args) {

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < signs.length; i++) {
            if(!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }
        }
        answer = Arrays.stream(absolutes).sum();

        return answer;
    }

    public static int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
