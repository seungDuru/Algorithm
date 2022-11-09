package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 뉴스클러스터링 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("handshake", "shake hands"));
    }

    public static int solution(String str1, String str2) {
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        List<String> list1 = makeList(str1.toLowerCase());
        List<String> list2 = makeList(str2.toLowerCase());

        Collections.sort(list1);
        Collections.sort(list2);

        for(String st : list1) {
            if(list2.remove(st)) {
                intersection.add(st);
            }
            union.add(st);
        }

        if(!list2.isEmpty()) {
            for(String st : list2) {
                union.add(st);
            }
        }

        System.out.println(intersection.size());
        System.out.println(union.size());

        double jakard = 0;

        if(union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double)intersection.size() / (double)union.size();
        }

        return (int)(jakard * 65536);
    }

    public static List<String> makeList(String str){
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i < str.length() - 1 ; ++i){
            char first = str.charAt(i);
            char second = str.charAt(i + 1);

            if(first >= 'a' && first <= 'z' &&
                    second >= 'a' && second <= 'z'){
                list.add(first + "" + second);
            }
        }
        return list;
    }

    public static String changeWord(String str) {
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}
