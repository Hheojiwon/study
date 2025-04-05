package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_11725 {

    static List<Integer> list[]; // 연결 정보
    static boolean[] isVisited; //방문 여부 체크
    static int[] parents; //부모 노드

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        list = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            String[] st = br.readLine().split(" ");
            int A = Integer.parseInt(st[0]);
            int B = Integer.parseInt(st[1]);

            list[A].add(B);
            list[B].add(A);
        }

        DFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void DFS(int index) {
        isVisited[index] = true;

        for (int i : list[index]) {
            if (!isVisited[i]) {
                parents[i] = index;
                DFS(i);
            }
        }
    }
}
