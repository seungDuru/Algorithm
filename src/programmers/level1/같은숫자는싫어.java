package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int a : arr) {
            if(temp != a) list.add(a);
            temp = a;
        }
        return list.stream().mapToInt(c->c).toArray();
    }
}
