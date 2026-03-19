package 백준.dfs_bfs;

import java.io.*;
import java.util.*;

public class baekjoon_2644 {
    static int count = -1;
    static ArrayList<Integer>[] graph;
    static int a, b;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        DFS(a, 0);
        System.out.println(count);

    }

    public static void DFS(int current, int depth) {
        if (visited[current]) return;
        visited[current] = true;
        if (current == b) {
            count = depth;
            return;
        }
        for (int next : graph[current]) {
            if (!visited[next]) {
                DFS(next, depth + 1);
            }
        }
    }
}
