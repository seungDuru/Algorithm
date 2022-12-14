package programmers.level2;

public class 전력망둘로나누기 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        System.out.println(solution(9, wires));
    }

    static int[][] graph;
    static boolean[] visited;
    static int cnt;

    public static int solution(int n, int[][] wires) {
        int answer = n;
        for(int i = 0; i < wires.length; i++) {

            graph = new int[n][n];
            visited = new boolean[n];
            cnt = 0;

            for(int j = 0; j < wires.length; j++) {
                if(i != j) {
                    int u = wires[j][0] -1;
                    int v = wires[j][1] -1;
                    graph[u][v] = graph[v][u] = 1;
                }
            }

            dfs(0, n);
            int div = Math.abs((n - cnt) - cnt);

            answer = Math.min(div, answer);
        }

        return answer;
    }

    public static void dfs(int node, int N) {
        visited[node] = true;
        cnt++;

        for(int next = 0; next < N; next++) {
            if(!visited[next] && graph[node][next] != 0)
                dfs(next, N);
        }
    }
}
