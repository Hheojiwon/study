package 백준;

import java.io.*;
import java.util.*;

public class baekjoon_15989 {
    // 숫자를 오름차순으로만 쓰자..
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            if (numbers[i] > max) max = numbers[i];
        }

        dp = new int [max+1][4];

        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= max; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }

        for (int num : numbers){
            int answer = dp[num][1] + dp[num][2] + dp[num][3];
            System.out.println(answer);
        }

    }

}
