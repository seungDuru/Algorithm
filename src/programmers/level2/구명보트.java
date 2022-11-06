package programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class 구명보트 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] people = {70, 50, 80, 50};

        System.out.println(solution(people, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        boolean[] check = new boolean[people.length];
        Integer[] person = IntStream.of(people).boxed().toArray(Integer[]::new);
        Arrays.sort(person, Collections.reverseOrder());

        int cnt = check.length;
        while(cnt != 0) {

            int weight = 0;
            int spare = 0;

            for(int i = 0; i < person.length; i++) {
                weight = person[i];
                spare = limit - person[i];
            }
        }

        return answer;
    }
}
