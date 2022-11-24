package programmers.level2;

public class 배달 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 5;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        int K = 3;
        System.out.println(solution(N, road, K));

    }

    public static int solution(int N, int[][] road, int K) {
        final int INF= 987654321;
        int answer = 0;
        int[][] graph = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) graph[i][j] = 0;
                else graph[i][j] = INF;
            }
        }

        for(int i = 0; i < road.length; i++) {
            int u = road[i][0] -1;
            int v = road[i][1] -1;
            int dis = road[i][2];
            if(graph[u][v] < dis) continue;
            graph[u][v] = graph[v][u] = dis;
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[0][i] <= K)
                answer++;
        }

        return answer;
    }
}
