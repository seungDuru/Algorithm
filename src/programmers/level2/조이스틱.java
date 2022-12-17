package programmers.level2;

public class 조이스틱 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("JEROEN"));
    }

    public static int solution(String name) {
        int answer = 0;
        int pointer = 65;
        for(int i = 0; i < name.length(); i++) {
            char target = name.charAt(i);

            int reverse = 0;
            int distance = Math.abs(target - pointer);
            if(pointer >= target) reverse = 90 - pointer + target - 65;
            else reverse = 90 - target + pointer - 65;

            answer += Math.min(distance, reverse);
            pointer = target;
        }
        return answer;
    }
}
