package programmers.level1;

import javax.xml.stream.events.Characters;
import java.util.*;

public class 가장가까운같은글자 {

    public static void main(String[] args) {

        String s = "banana";

        System.out.println(solution(s));

    }

    public static int[] solution(String s) {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer index = alphabetMap.get(c);

            if (index == null) {
                list.add(-1);
            } else {
                list.add(i - index);
            }
            alphabetMap.put(c, i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
