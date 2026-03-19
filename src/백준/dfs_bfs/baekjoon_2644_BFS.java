package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.*;

public class baekjoon_2644_BFS {
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
        BFS(a);
        System.out.println(count);

    }

    public static int BFS(int N){
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[N + 1];

        queue.add(a);
        visited[a] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            if (current == b){
                return dist[current];
            }
            for (int next : graph[current]){
                if (!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[current] + 1;
                    queue.add(next);
                }
            }
        } return N;


    }

}
