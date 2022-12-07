package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 영어끝말잇기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        for(int a : solution(2, words)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            String beforeWord = list.get(i-1);
            String endSpell = beforeWord.charAt(beforeWord.length()-1) + "";

            if(words[i].length() > 1
                    && list.indexOf(words[i]) == -1
                    && words[i].startsWith(endSpell) ) {
                list.add(words[i]);
            } else {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (i + n) / n;
                return answer;
            }
        }
        answer[0] = answer[1] = 0;
        return answer;
    }
}
