package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 타겟넘버 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] numbers = {1, 2};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static class P{
        int sum;
        int index;

        P(int sum, int index){
            this.sum = sum;
            this.index = index;
        }
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        Queue<P> queue = new LinkedList<>();
        queue.offer(new P(0, 0));

        while(!queue.isEmpty()) {

            P p = queue.poll();

            int sum = p.sum;
            int index = p.index;

            if(index == numbers.length && sum == target) {
                answer++;
            }

            final int[] calc = {1, -1};
            for(int i = 0; i < calc.length; i++) {

                if(index >= numbers.length) continue;

                int num = sum + numbers[index] * calc[i];
                queue.offer(new P(num, index + 1));
            }
        }

        return answer;
    }
}
