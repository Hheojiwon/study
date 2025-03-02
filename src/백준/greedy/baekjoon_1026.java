package 백준.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class baekjoon_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[N];
        int[] B = new int[N];

        String str[] = br.readLine().split(" ");
        for (int j = 0; j < N; j++) {
            A[j] = Integer.parseInt(str[j]);
        }
        String str2[] = br.readLine().split(" ");
        for (int j = 0; j < N; j++) {
            B[j] = Integer.parseInt(str2[j]);
        }


        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i] * B[i];
        }
        System.out.println(sum);
    }
}
