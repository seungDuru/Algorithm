package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int allWeight = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int truck : truck_weights) {
            while(true) {
                if(queue.isEmpty()) {
                    queue.offer(truck);
                    allWeight += truck;
                    answer++;
                    break;
                } else if(queue.size() == bridge_length) {
                    allWeight -= queue.poll();
                } else {
                    if(allWeight + truck > weight) {
                        queue.add(0);
                        answer++;
                    } else {
                        queue.offer(truck);
                        allWeight += truck;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
