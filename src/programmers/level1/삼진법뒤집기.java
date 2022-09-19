package programmers.level1;

import java.util.ArrayList;

public class 삼진법뒤집기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(45));
    }

    public static int solution(int n) {
        int answer = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while(true){
            if(n<3){ temp.add(n); break; }
            temp.add(n%3);
            n = n/3;
        }

        for(int i=0; i<temp.size(); i++){
            answer += (Math.pow(3,temp.size()-i-1)*temp.get(i));
        }

        return answer;
    }

    public static int solution2(int n) {
        String a = "";
        while(n > 0){
            a = a + (n % 3);
            n /= 3;
        }
        return Integer.parseInt(a,3);
    }
}
