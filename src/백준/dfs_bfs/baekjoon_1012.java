package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1012 {

    static int[][] field;
    static boolean[][] isVisited;
    static int M, N, K;
    static int count;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void DFS(int x, int y) {

        if (x < 0 || y < 0 || x >= M || y >= N || isVisited[y][x] || field[y][x] == 0) {
            return;
        }
        isVisited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            DFS(x + dx[i], y + dy[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int k = 0; k < T; k++) {
            count = 0;
            String[] st = br.readLine().split(" ");
            M = Integer.parseInt(st[0]);
            N = Integer.parseInt(st[1]);
            K = Integer.parseInt(st[2]);
            isVisited = new boolean[N][M];
            field = new int[N][M];
            for (int i = 0; i < K; i++) {
                int X, Y;
                String[] str = br.readLine().split(" ");
                X = Integer.parseInt(str[0]);
                Y = Integer.parseInt(str[1]);
                field[Y][X] = 1;
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[y][x] == 1 && !isVisited[y][x]) {
                        DFS(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
