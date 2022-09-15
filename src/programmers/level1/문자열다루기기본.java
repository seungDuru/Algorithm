package programmers.level1;

public class 문자열다루기기본 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution2("1123"));
    }

    public static boolean solution(String s) {
        return s.matches("^[0-9]*?") && (s.length() == 4 || s.length() == 6);
    }

    public static boolean solution2(String s) {
        return s.matches("^[0-9]{4}|{6}$");
    }
}
