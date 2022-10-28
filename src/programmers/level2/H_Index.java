package programmers.level2;

import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution2(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        int min = Arrays.stream(citations).min().getAsInt();
        int max = Arrays.stream(citations).max().getAsInt();

        while(true) {
            final int mid = (min + max) / 2;
            int count = (int) Arrays.stream(citations).filter(f -> f >= mid).count();

            if(count != mid) {
                if(count > mid) {
                    min = mid + 1;
                }else {
                    max = mid - 1;
                }
            } else {
                answer = mid;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
