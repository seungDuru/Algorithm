package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프린터 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] priorities = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(priorities, 0));
    }

    public static class P{
        int prior;
        int order;

        P(int prior, int order){
            this.prior = prior;
            this.order = order;
        }
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Queue<P> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            list.add(priorities[i]);
            queue.offer(new P(priorities[i], i));
        }

        while(!queue.isEmpty()) {
            Integer max = list.stream().mapToInt(c->c).max().getAsInt();
            P current = queue.poll();

            if(current.prior == max) {
                answer++;
                list.remove(max);
                if(current.order == location) return answer;
            } else {
                queue.offer(new P(current.prior, current.order));
            }
        }

        return answer;
    }
}
