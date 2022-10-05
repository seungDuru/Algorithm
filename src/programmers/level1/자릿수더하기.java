package programmers.level1;

public class 자릿수더하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    
    }
    
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        String[] arr = num.split("");

        for(String st : arr) {
            answer += Integer.parseInt(st);
        }

        return answer;
    }
}
