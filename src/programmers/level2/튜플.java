package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 튜플 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        for(int a : solution(s)) {
            System.out.println(a);
        }
    }

    public static int[] solution(String s) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        String num = "";

        for(int i = 1; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if(ch == '{') continue;
            else if(ch == ',' && s.charAt(i+1) == '{' ) continue;
            else if(ch == '}') {
                List<Integer> intList = new ArrayList<>();
                for(String a : num.split(",")) {
                    intList.add(Integer.parseInt(a));
                }
                list.add(intList);
                num = "";
            }
            else num += ch + "";
        }

        int index = 1;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                List<Integer> lis = list.get(j);

                if(lis.size() == index) {
                    lis.removeAll(answerList);
                    answerList.addAll(lis);
                    index++;
                }
            }
        }

        return answerList.stream().mapToInt(c->c).toArray();
    }

    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
