package 백준;

import java.io.*;
import java.util.*;

public class baekjoon_14503 {

    static boolean[][] isVisited;
    static int[][] map;
    static int r, c, d;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        isVisited = new boolean[N][M];
        map = new int[N][M];

        StringTokenizer str = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        int d = Integer.parseInt(str.nextToken());

        for (int i = 0; i < N; i++) {
            StringTokenizer string = new StringTokenizer(br.readLine());
            for (int k = 0; k < M; k++) {
                int num = Integer.parseInt(string.nextToken());
                map[i][k] = num;
                if (num == 1) {
                    isVisited[i][k] = true;
                }
            }
        }
        simulate(r, c, d);
        System.out.println(count);


    }

    static void simulate(int r, int c, int d) {
        while (true) {
            if (!isVisited[r][c]) {
                count++;
                isVisited[r][c] = true;
            }
            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int ny = r + dy[d];
                int nx = c + dx[d];
                if (map[ny][nx] == 0 && !isVisited[ny][nx]) {
                    r = ny;
                    c = nx;
                    moved = true;
                    break;
                }
            }
            if (moved) continue;
            int back = (d + 2) % 4;
            int ny = r + dy[back];
            int nx = c + dx[back];
            if (map[ny][nx] == 1) break;
            r = ny;
            c = nx;
        }
    }
}
