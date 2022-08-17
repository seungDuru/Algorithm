package programmers.level1;

public class X만큼간격이있는N개의숫자 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++) {
            int num = x * (i+1);
            answer[i] = num;
        }
        return answer;
    }
}
