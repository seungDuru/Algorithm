package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        String[] participant = {"leo", "leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution2(participant, completion));
    }


    public static String solution(String[] participant, String[] completion) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(participant));

        for(String name : completion) {
            list.remove(name);
        }

        return list.get(0);
    }

    public static String solution2(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion){
            map.put(name, map.get(name) - 1);
        }

        for (String key : map.keySet()){
            if (map.get(key) > 0){
                answer = key;
                break;
            }
        }

        return answer;
    }
}
