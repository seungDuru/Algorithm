package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        for(int a : solution(progresses, speeds)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int pointer = 0;

        while(pointer < progresses.length) {

            if(progresses[pointer] >= 100) {
                int sum = 0;
                for(int i = pointer; i < progresses.length; i++) {
                    if(progresses[i] >= 100) {
                        sum++;
                        pointer++;
                    } else {
                        break;
                    }
                }
                list.add(sum);
            }

            for(int i = 0; i < progresses.length; i++) {
                progresses[i] = progresses[i] + speeds[i];
            }
        }

        return list.stream().mapToInt(c -> c).toArray();
    }
}
