package 백준.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long max = arr[N - 1];
        long min = 1;
        long count, mid;

        while (min <= max) {
            count = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < N; i++) count += arr[i] / mid;

            if (count < K) max = mid - 1;
            else min = mid + 1;
        }
        System.out.println(max);

    }
}
