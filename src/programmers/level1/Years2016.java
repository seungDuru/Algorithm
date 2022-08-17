package programmers.level1;

public class Years2016 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
        String[] arr = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day = 0;
        for (int i = 0; i < a - 1; i++) {
            day += date[i];
        }
        day += (b - 1);
        return arr[day % 7];
    }
}
