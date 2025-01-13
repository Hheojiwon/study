package 백준.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_16564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int K = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[0]);
        int[] levels = new int[N];
        for (int i = 0; i < levels.length; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(levels);


        System.out.println(binarySearch(levels, K, levels[0], levels[N - 1] + K));

    }


    public static int binarySearch(int[] arr, int target, int min, int max) {
        int result = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            long count = 0;
            for (int i : arr) {
                if (mid - i > 0) {
                    count += mid - i;
                }
            }
            if (count > target) {
                max = mid - 1;
            } else {
                result = mid;
                min = mid + 1;
            }
        }
        return result;
    }

}
