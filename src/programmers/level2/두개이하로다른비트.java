package programmers.level2;

public class 두개이하로다른비트 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long[] numbers = {2,7};
//		for(long a : solution(numbers)) {
//			System.out.println(a);
//		}

        System.out.println((7^8)>>2);
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {

            long targetNum = numbers[i];
            String stdr = Long.toBinaryString(numbers[i]);

            if(numbers[i] % 2 == 0) {
                answer[i] = targetNum + 1;
            }else {
                while(true) {
                    targetNum++;
                    String target = Long.toBinaryString(targetNum);

                    if(checkAnswer(stdr, target)) {
                        answer[i] = targetNum;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean checkAnswer(String stdr, String target) {
        int cnt = 0;
        if(stdr.length() != target.length()) stdr = "0" + stdr;
        for(int i = 0; i < target.length(); i++) {
            if(stdr.charAt(i) != target.charAt(i)) {
                cnt++;
            }
            if(cnt > 2) return false;
        }
        return true;
    }
}
