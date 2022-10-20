package programmers.level1;

import java.util.Stack;

public class 크레인인형뽑기 {

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();	// �ٱ��� ����
        stack.push(0);	//���� �ʱ�ȭ

        for(int a : moves) {
            int mp = a - 1;	//movePoint

            for(int i = 0; i < board.length; i++) {
                if( board[i][mp] != 0 ) {
                    if( stack.peek() == board[i][mp] ) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][mp]);
                    }
                    board[i][mp] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
