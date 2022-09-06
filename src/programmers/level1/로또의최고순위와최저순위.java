package programmers.level1;

import java.util.stream.IntStream;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        for(int a : solution(lottos, win_nums)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, contain = 0;
        for(int i = 0; i < lottos.length; i++) {
            int num = lottos[i];
            if(num == 0) zero++;
            if(IntStream.of(win_nums).anyMatch(s -> s == num)) contain++;
        }
        int win = (contain + zero) > 1 ? 7 - (contain + zero) : 6;
        int lose = contain > 1 ? 7 - contain : 6;
        return new int[] {win, lose};
    }
}
