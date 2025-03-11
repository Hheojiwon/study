package 백준.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        String input = br.readLine();
        String[] treeArr = input.split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < treeArr.length; i++) {
            arr[i] = Integer.parseInt(treeArr[i]);
        }

        Arrays.sort(arr);
        int answer = binarySearch(arr, M, 0, arr[N - 1]);
        System.out.println(answer);

    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return high;
        }

        int mid = low + (high - low) / 2;
        long sum = 0;

        for (int tree : arr) {
            if (tree > mid) {
                sum += (tree - mid);
            }
        }

        if (sum >= target) {

            return binarySearch(arr, target, mid + 1, high);
        } else {

            return binarySearch(arr, target, low, mid - 1);
        }
    }


}
