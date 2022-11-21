package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 메뉴리뉴얼 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        String[] orders2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,4};
        int[] course2 = {2,3,5};

    }

    private Map<String, Integer> menu = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<course.length; i++){
            for(int j=0; j<orders.length; j++){
                boolean[] check = new boolean[orders[j].length()];
                String[] sort_order = orders[j].split("");
                Arrays.sort(sort_order);
                combination(sort_order, check, 0, course[i]);
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(menu.entrySet());

            entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            int max = 0;
            for(Map.Entry<String, Integer> entry : entries) {
                if(entry.getValue() > 1 && max <= entry.getValue()) {
                    max = entry.getValue();
                    answer.add(entry.getKey());
                }
            }

            menu.clear();
        }

        String[] answerArr = answer.toArray(new String[1]);
        Arrays.sort(answerArr);

        return answerArr;
    }

    public void combination(String[] arr, boolean[] check, int index, int r) {
        if (r == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (check[i])
                    stringBuilder.append(arr[i]);
            }

            if(menu.containsKey(stringBuilder.toString()))
                menu.put(stringBuilder.toString(), menu.get(stringBuilder.toString()) + 1);
            else
                menu.put(stringBuilder.toString(), 1);
        } else {
            for (int i = index; i < arr.length; i++) {
                check[i] = true;
                combination(arr, check, i + 1, r - 1);
                check[i] = false;
            }
        }
    }
}
