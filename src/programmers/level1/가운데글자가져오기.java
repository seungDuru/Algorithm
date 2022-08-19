package programmers.level1;

public class 가운데글자가져오기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("qwer"));

        //System.out.println("abcde".charAt(2));
    }

    public static String solution(String s) {
        String answer = "";
        int half = s.length() / 2;
        if(s.length() % 2 == 1) answer = String.valueOf(s.charAt(half));
        else answer = String.valueOf(s.charAt(half-1) +""+ s.charAt(half));
        return answer;
    }
}
