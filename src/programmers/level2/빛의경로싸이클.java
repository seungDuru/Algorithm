package programmers.level2;

import java.util.ArrayList;

public class 빛의경로싸이클 {

    static int R, C;
    static int[] dr = { -1, 0, 1, 0 }, dc = { 0, -1, 0, 1 }; // �Ʒ�, ��, ��, ����
    static boolean[][][] isVisited;

    public int[] solution(String[] grid) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        R = grid.length;
        C = grid[0].length();

        isVisited = new boolean[R][C][4];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                for (int d = 0; d < 4; d++) {
                    if (!isVisited[i][j][d])
                        answer.add(light(grid, i, j, d ));
                }
            }
        }

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    private static int light(String[] grid, int r, int c, int d) {
        int cnt = 0; // �̵��Ÿ�

        while (true) {
            if (isVisited[r][c][d])
                break;

            cnt++;	// �Ÿ�����
            isVisited[r][c][d] = true; // �湮ó��

            if (grid[r].charAt(c) == 'L')
                d = d == 0 ? 3 : d - 1; // ��ȸ��
            else if (grid[r].charAt(c) == 'R')
                d = d == 3 ? 0 : d + 1; // ��ȸ��

            r = (r + dr[d] + R) % R;
            c = (c + dc[d] + C) % C;
        }

        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
