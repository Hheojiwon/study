package 백준;
import java.io.*;
import java.util.*;

public class baekjoon_3758 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            int t = Integer.parseInt(st[2]);
            int m = Integer.parseInt(st[3]);

            int[][] scores = new int[n][k];
            int[] count = new int[n];
            int[] last = new int[n];

            for (int j = 0; j < m; j++) {
                StringTokenizer str = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(str.nextToken());
                int solveId = Integer.parseInt(str.nextToken());
                int score = Integer.parseInt(str.nextToken());

                if (scores[id-1][solveId-1] < score) {
                    scores[id-1][solveId-1] = score;
                }
                count[id-1]++;
                last[id-1] = j;
            }

            int[][] teamInfo = new int[n][4];

            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int num : scores[j]) {
                    sum += num;
                }
                teamInfo[j][0] = j;
                teamInfo[j][1] = sum;
                teamInfo[j][2] = count[j];
                teamInfo[j][3] = last[j];
            }

            Arrays.sort(teamInfo, (o1, o2) ->
                    o1[1] == o2[1]
                            ? (o1[2] == o2[2]
                            ? o1[3] - o2[3]
                            : o1[2] - o2[2])
                            : o2[1] - o1[1]
            );

            for (int j = 0; j < n; j++) {
                if (teamInfo[j][0] == t - 1) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}