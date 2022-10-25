package programmers.level1;

import java.util.Arrays;

public class 하샤드수 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean solution(int x) {
        int sum = Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        return x % sum == 0;
    }

    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();

        return x % sum == 0;
    }
}
