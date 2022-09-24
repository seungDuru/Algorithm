package programmers.level1;

public class 수박수박수박수박수박수 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) answer += "��";
            else answer += "��";
        }
        return answer;
    }
}
