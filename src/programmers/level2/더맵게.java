package programmers.level2;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 더맵게 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));

    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        List<Integer> list = IntStream.of(scoville).boxed().collect(Collectors.toList());
        long count = 1;
        while(count > 0) {
            answer++;
            int mix = 0;
            for(int i = 0; i < 2; i++) {
                int min = list.stream().mapToInt(c -> c).min().getAsInt();
                int index = list.indexOf(min);
                list.remove(index);

                if(i == 0) mix += min;
                else mix = mix + min * 2;
            }

            list.add(mix);
            count = list.stream().filter(f -> f < K).count();
        }

        return answer;
    }

    public static int solution2(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            heap.offer(scoville[i]);
        }

        while (heap.peek() < K) {
            if (heap.size() < 2) return -1;
            int f1 = heap.poll();
            int f2 = heap.poll();

            int mix = f1 + (f2 * 2);
            heap.offer(mix);
            answer++;
        }

        return answer;
    }
}
