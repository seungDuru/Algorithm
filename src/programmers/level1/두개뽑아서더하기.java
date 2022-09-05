package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class 두개뽑아서더하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numbers = {2,1,3,4,1};

        for(int a : solution(numbers)) {
            System.out.println(a);
        }

    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int first = numbers[i];
                int second = numbers[j];
                if(!list.contains(first+second)) list.add(first+second);
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(a -> a).toArray();
    }

    public static int[] solution2(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().mapToInt(a -> a).toArray();
    }
}
