package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;;

public class 순위검색 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    static Map<String, Integer> wordMap = new HashMap<>();
    static List<List<Integer>> scoreList = new ArrayList<>();

    public static int[] solution(String[] info, String[] query) {
        wordMap.put("-", 0);
        wordMap.put("cpp", 1);
        wordMap.put("java", 2);
        wordMap.put("python", 3);
        wordMap.put("backend", 1);
        wordMap.put("frontend", 2);
        wordMap.put("junior", 1);
        wordMap.put("senior", 2);
        wordMap.put("chicken", 1);
        wordMap.put("pizza", 2);

        for(int i = 0; i < 4*3*3*3; i++) {
            scoreList.add(new ArrayList<>());
        }

        for(String str : info) {
            String[] word = str.split(" ");
            int[] arr = {wordMap.get(word[0]) *3*3*3,
                    wordMap.get(word[1]) *3*3,
                    wordMap.get(word[2]) *3,
                    wordMap.get(word[3])};
            int score = Integer.parseInt(word[4]);

            for(int i = 0; i < (1<<4); i++) {
                int idx = 0;
                for(int j = 0; j < 4; j++) {
                    if((i & (1<<j)) != 0) {
                        idx += arr[j];
                    }
                }
                scoreList.get(idx).add(score);
            }
        }

        for(int i = 0; i < 4*3*3*3; i++) {
            Collections.sort(scoreList.get(i));
        }

        int[] answer = new int[query.length];

        for(int i = 0; i < query.length; i++) {
            String[] word = query[i].split(" ");
            int idx = wordMap.get(word[0]) *3*3*3 +
                    wordMap.get(word[2]) *3*3 +
                    wordMap.get(word[4]) *3 +
                    wordMap.get(word[6]);
            int score = Integer.parseInt(word[7]);
            int ret = Collections.binarySearch(scoreList.get(idx), score);
            if(ret < 0) {
                ret = -(ret + 1);
            } else {
                for(int j = ret - 1; j >= 0; j--) {
                    if(scoreList.get(idx).get(j) == score) {
                        ret = j;
                    } else {
                        break;
                    }
                }
            }
            answer[i] = scoreList.get(idx).size() - ret;
        }

        return answer;
    }
}
