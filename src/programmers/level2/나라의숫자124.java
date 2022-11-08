package programmers.level2;

public class 나라의숫자124 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(12));
    }

    public static String solution(int n) {
        String answer = "";
        String[] arr = {"4", "1", "2"};

        while(n > 0) {
            answer = arr[n % 3] + answer;
            n = n % 3 == 0 ? (n / 3) -1 : n / 3;
        }

        return answer;
    }

    public static String solution2(int n) {
        String answer = "";
        String[] num = { "4", "1", "2" };

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}
