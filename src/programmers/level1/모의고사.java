package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        for(int a : solution(answers)) System.out.println(a);
    }

    public static int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] man1 = {1, 2, 3, 4, 5};
        int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == man1[i%man1.length]) answer[0]++;
            if(answers[i] == man2[i%man2.length]) answer[1]++;
            if(answers[i] == man3[i%man3.length]) answer[2]++;
        }
        int max = Arrays.stream(answer).max().getAsInt();

        List<Integer> list = new ArrayList<>();

        if(max == answer[0]) list.add(1);
        if(max == answer[1]) list.add(2);
        if(max == answer[2]) list.add(3);

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
