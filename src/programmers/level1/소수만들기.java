package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {

    public static void main(String[] args) {

        int[] nums = {1,2,7,6,4};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for(int num : list) {
            if(!checkPrimeNum(num)) answer++;
        }

        return answer;
    }

    public static boolean checkPrimeNum(int num) {
        boolean isNotPrimeNumb = false;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isNotPrimeNumb = true;
                break;
            }
        }

        return isNotPrimeNumb;
    }
}
