package programmers.level1;

public class 문자열을정수로바꾸기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
