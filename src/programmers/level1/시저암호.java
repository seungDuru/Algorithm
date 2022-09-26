package programmers.level1;

public class 시저암호 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution("z", 1));

    }

    public static String solution(String s, int n) {
        String answer = "";

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            int num = arr[i] - 0;

            if(num >= 65 && num <= 90) {
                if(num + n > 90) {
                    num = 64 + (num + n - 90);
                } else {
                    num = num + n;
                }
            }

            if(num >= 97 && num <= 122) {
                if(num + n > 122) {
                    num = 96 + (num + n - 122);
                } else {
                    num = num + n;
                }
            }

            arr[i] = (char) num;
        }
        answer = String.valueOf(arr);

        return answer;
    }
}
