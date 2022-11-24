package programmers.level2;

public class 문자열압축 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "abcabcabcabcdededededede";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = s.length();
        for(int i = 1; i <= s.length() / 2; i++){
            int zipLevel = 1;
            String zipStr = s.substring(0, i);
            StringBuilder result = new StringBuilder();

            for(int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if(zipStr.equals(next)) zipLevel++;
                else {
                    result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
                    zipStr = next;
                    zipLevel = 1;
                }
            }
            result.append(zipStr);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}
