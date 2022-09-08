package programmers.level1;

public class 문자열내p와y의개수 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split("");

        for (int i = 0; i < array.length; i++) {
            if ("p".equals(array[i])) {
                pCount++;
            } else if ("y".equals(array[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }

    boolean solution2(String s) {
        return s.toUpperCase().chars().filter( e -> 'P'== e).count() == s.toUpperCase().chars().filter( e -> 'Y'== e).count();
    }
}
