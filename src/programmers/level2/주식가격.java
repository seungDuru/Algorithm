package programmers.level2;

public class 주식가격 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] prices = {1, 2, 3, 2, 3};
        for(int a : solution(prices)) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                } else {
                    answer[i] = prices.length -1 - i;
                }
            }
        }

        return answer;
    }
}
