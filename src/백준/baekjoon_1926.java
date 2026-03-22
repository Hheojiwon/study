package 백준;

import java.io.*;
import java.util.*;


public class baekjoon_1926 {

    static int[][] map;
    static boolean[][] isVisited;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int N, M;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        isVisited = new boolean[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!isVisited[i][j] && map[i][j] == 1) {
                    list.add(DFS(i, j));
                    count++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        System.out.println(count==0?0:list.get(list.size() - 1));
    }

    static int DFS(int x, int y) {
        isVisited[x][y] = true;
        int curX = x;
        int curY = y;
        int area = 1;
        for (int i = 0; i < 4; i++) {
            curX = x + dirX[i];
            curY = y + dirY[i];
            if (curX >= 0 && curY >= 0 && curX < N && curY < M && map[curX][curY] == 1 && !isVisited[curX][curY]) {
                area += DFS(curX, curY);
            }
        }
        return area;
    }
}
