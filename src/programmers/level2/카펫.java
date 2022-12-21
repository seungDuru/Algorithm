package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 카펫 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int a : solution(24, 24)) {
            System.out.println(a);
        }
    }

    public static class P{
        int col;
        int row;

        P(int col, int row){
            this.col = col;
            this.row = row;
        }
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        Queue<P> q = new LinkedList<>();
        int row = 0;
        int col = 0;

        int total = brown + yellow;
        for(int i = 3; i < brown/2; i++) {
            if(total % i == 0 && i >= total / i) {
                col = i;
                row = total / i;
                q.offer(new P(col, row));
            }
        }

        while(!q.isEmpty()) {
            P cur = q.poll();

            System.out.println("col : " + cur.col);
            System.out.println("row : " + cur.row);

            for(int i = 1; i <= yellow; i++) {

                if(yellow % i == 0 && i >= yellow/i) {
                    if(cur.col == i+2 && cur.row == yellow/i+2) {
                        answer[0] = cur.col;
                        answer[1] = cur.row;
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
