package programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        return new StringBuffer(String.valueOf(chArr)).reverse().toString();
    }
}
