package 백준.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] st = sc.nextLine().split(" ");
        int[] nArr = Arrays.stream(st)
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(nArr);

        int M = sc.nextInt();
        sc.nextLine();
        String[] st2 = sc.nextLine().split(" ");
        int[] mArr = Arrays.stream(st2)
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : mArr) {
            if (binarySearch(nArr, i)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
