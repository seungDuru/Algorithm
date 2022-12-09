package programmers.level2;

public class 예상대진표 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public int solution(int n, int a, int b){
        int answer = 1;
        int left = 0;
        int right = 0;

        if(a > b){
            left = b;
            right = a;
        } else {
            left = a;
            right = b;
        }

        while(true){
            if(left % 2 != 0 && right - left == 1){
                break;
            }

            left = (left + 1) / 2;
            right = (right + 1) / 2;
            answer++;
        }

        return answer;
    }

    public int solution2(int n, int a, int b) {
        int round = 0;
        while(a != b)
        {
            a = a/2 + a%2;
            b = b/2 + b%2;
            round++;
        }
        return round;
    }
}
