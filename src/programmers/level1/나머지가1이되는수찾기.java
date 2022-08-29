package programmers.level1;

import java.util.stream.IntStream;

public class 나머지가1이되는수찾기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
