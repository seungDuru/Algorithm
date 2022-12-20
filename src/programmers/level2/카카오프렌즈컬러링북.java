package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 카카오프렌즈컬러링북 {

    public static void main(String[] args) {
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        //int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
        int m = 6;
        int n = 4;

        for(int a : solution(m, n, picture)) System.out.println(a);
    }

    static boolean[][] check;
    static class P{
        int x, y;

        P(int x, int y){
            this.x = x;
            this.y = y;
        }

        boolean isValid(int m, int n) {
            if(x < 0 || x >= n) return false;
            if(y < 0 || y >= m) return false;
            return true;
        }
    }


    public static int[] solution(int m, int n, int[][] picture) {
        check = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!check[i][j] && picture[i][j] != 0) {
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, search(i, j, picture));

                }
            }
        }

        return new int[] {numberOfArea, maxSizeOfOneArea};
    }

    public static int search(int m, int n, int[][] picture) {
        Queue<P> queue = new LinkedList<>();

        check[m][n] = true;
        queue.offer(new P(n, m));
        int result = 1;

        while(!queue.isEmpty()) {
            P current = queue.poll();
            int now = picture[current.y][current.x];

            int[][] action = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            for(int i = 0; i < action.length; i++) {
                P moved = new P(current.x + action[i][0], current.y + action[i][1]);

                if(!moved.isValid(picture.length, picture[0].length)) continue;

                if(!check[moved.y][moved.x] && now == picture[moved.y][moved.x]) {
                    queue.offer(moved);
                    check[moved.y][moved.x] = true;
                    result++;
                }
            }
        }

        return result;
    }
}
