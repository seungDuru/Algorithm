package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 포켓몬 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = {3,3,3,2,2,4};

        System.out.println(solution2(nums));

    }

    public static int solution(int[] nums) {

        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int a : nums) {
            if(!list.contains(a)) list.add(a);
        }
        answer = list.size() <= nums.length / 2 ? list.size() : nums.length / 2;

        return answer;
    }

    public static int solution2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        p -> Integer.min(p.size(), nums.length / 2)));
    }
}
