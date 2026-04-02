package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_2178_2 {

    static int N, M;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static boolean[][] isVisited;
    static int[][] map;


    // BFS는 queue가 빌때까지 반복해야함...
    public static void BFS(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{x, y});
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int cx = now[0], cy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dirX[i];
                int ny = cy + dirY[i];
                if (nx < 0 || nx >=N || ny < 0 || ny >= M) continue;
                if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    isVisited[nx][ny] = true;

                    map[nx][ny] = map [cx][cy]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        isVisited = new boolean[N][M];
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0'; // 0을 빼서 숫자값으로 저장
            }
        }
        br.close();

        BFS(0,0);
        System.out.println(map[N-1][M-1]);
    }
}
