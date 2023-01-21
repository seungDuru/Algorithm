package programmers.level2;

public class 행렬테두리회전하기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
        for(int a : solution(6,6,queries)) {
            System.out.println(a);
        }
    }

    static int[][] matrix;

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        matrix = new int[rows][columns];
        int num = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }

        return answer;
    }

    public static int rotate(int[] arr) {
        int r1 = arr[0]-1;
        int c1 = arr[1]-1;
        int r2 = arr[2]-1;
        int c2 = arr[3]-1;

        int init = matrix[r1][c1];
        int min = init;
        for(int i = r1; i < r2; i++){
            matrix[i][c1] = matrix[i+1][c1];
            min = Math.min(min, matrix[i][c1]);
        }
        for(int i = c1; i < c2; i++){
            matrix[r2][i] = matrix[r2][i+1];
            min = Math.min(min, matrix[r2][i]);
        }
        for(int i = r2; i > r1; i--){
            matrix[i][c2] = matrix[i-1][c2];
            min = Math.min(min, matrix[i][c2]);
        }
        for(int i = c2; i > c1; i--){
            matrix[r1][i] = matrix[r1][i-1];
            min = Math.min(min, matrix[r1][i]);
        }
        matrix[r1][c1+1] = init;

        return min;
    }
}
