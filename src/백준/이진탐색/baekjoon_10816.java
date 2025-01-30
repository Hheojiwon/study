package 백준.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nStr = br.readLine().split(" ");
        int[] nArr = Arrays.stream(nStr)
                .mapToInt(Integer::parseInt)
                .sorted().toArray();

        int M = Integer.parseInt(br.readLine());
        String[] mStr = br.readLine().split(" ");
        int[] mArr = Arrays.stream(mStr)
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb= new StringBuilder();
        for (int target : mArr) {
            int count = upper_bound(nArr, target) - lower_bound(nArr, target);
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static int lower_bound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (high + low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upper_bound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (high + low) / 2;
            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}
