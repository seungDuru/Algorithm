package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

    public static void main(String[] args) {
        int N = 5;
//		int N = 4;
        int[] stages = {1,1,1,1,1,1,1,1,1};
//		int[] stages = {4, 4, 4, 4, 4};

        for(int a : solution(N, stages)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int stay = calcStay(stages, i + 1);
            int total = calcTotal(stages, i + 1);

            if(total != 0) map.put(i + 1, (double) stay / total);
            else map.put(i + 1, 0.0);
        }
        List<Integer> listKeySet = new ArrayList<>(map.keySet());

        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        for(int i = 0; i < listKeySet.size(); i++) answer[i] = listKeySet.get(i);

        return answer;
    }

    public static int calcStay(int[] stages, int num) {
        return (int) Arrays.stream(stages).filter(h -> h == num).count();
    }

    public static int calcTotal(int[] stages, int num) {
        return (int) Arrays.stream(stages).filter(h -> h >= num).count();
    }
}
