package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_2178 {

    static int[][] arr, distance;
    static boolean[][] isVisited;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int N, M, nowX, nowY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }
        System.out.println(BFS(0, 0));
    }

    public static int BFS(int x, int y) {
        isVisited = new boolean[N][M];
        queue.add(new int[]{x, y});
        isVisited[x][y] = true;
        distance = new int[N][M];
        distance[x][y] = 1;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();
            for (int i = 0; i < 4; i++) {
                nowX = dirX[i] + curX;
                nowY = dirY[i] + curY;
                if (nowX >= 0 && nowX < N && nowY >= 0 && nowY < M) {
                    if (arr[nowX][nowY] == 1 && !isVisited[nowX][nowY]) {
                        isVisited[nowX][nowY] = true;
                        queue.add(new int[]{nowX, nowY});
                        distance[nowX][nowY] = distance[curX][curY] + 1;
                    }
                }
            }
        }
        return distance[N - 1][M - 1];
    }
}