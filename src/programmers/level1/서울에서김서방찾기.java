package programmers.level1;

import java.util.Arrays;

public class 서울에서김서방찾기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution2(seoul));
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "�輭���� " + i + "�� �ִ�";
                break;
            }
        }

        return answer;
    }

    public static String solution2(String[] seoul) {
        return Arrays.stream(seoul)
                .mapToInt(e -> {
                    int i = 0;
                    if (!e.equals("Kim")) {
                        ++i;
                    }
                    return i;
                })
                .mapToObj(s -> "�輭���� " + s + "�� �ִ�")
                .findFirst()
                .get();
    }
}
