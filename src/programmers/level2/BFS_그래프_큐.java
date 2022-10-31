package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_그래프_큐 {

    static final int MAX_N = 10;	//���� ���ǿ� ���� �ٸ�
    static int N;	//��� ����
    static int E;	//������ ����
    static int[][] graph = new int[MAX_N][MAX_N];	//������� �׷���
    //�湮���� ��Ʈ������ŭ ����

    public static void main(String[] args) {

        N = 5;
        E = 6;
        String[] arr = {"0 1", "0 2", "1 3", "1 4", "2 4", "3 4"};

        solution(N, E, arr);
    }

    public static void solution(int N, int E, String[] arr) {


        for(int i = 0; i < arr.length; i++) {
            String[] str = arr[i].split(" ");

            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            graph[u][v] = graph[v][u] = 1;
        }

        bfs(0);
    }

    public static void bfs(int node) {
        boolean[] visited = new boolean[MAX_N];

        Queue<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.offer(node);

        while(!queue.isEmpty()) {
            int curr = queue.poll();

            System.out.println(curr + " ");

            for(int next = 0; next < N; next++) {
                if(!visited[next] &&	//�湮�� ���� �ʾ�����
                        graph[curr][next] != 0)	//������ �����ҋ�
                    visited[next] = true;
                queue.offer(next);
            }
        }
    }
}
