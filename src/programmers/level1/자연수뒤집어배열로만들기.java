package programmers.level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] solution(long n) {

        StringBuffer sb = new StringBuffer(String.valueOf(n));
        return Arrays.asList(String.valueOf(sb.reverse().toString()).split(""))
                .stream()
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
