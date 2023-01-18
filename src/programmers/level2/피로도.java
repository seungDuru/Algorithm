package programmers.level2;

public class 피로도 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(80, dungeons));

    }

    static boolean visited[];
    static int max;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return max;
    }

    public static void dfs(int k, int[][] dungeons, int cnt) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, cnt + 1);
                visited[i] = false;
            }
        }
        max = Math.max(max, cnt);
    }
}
