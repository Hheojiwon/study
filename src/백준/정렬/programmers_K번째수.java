package 백준.정렬;

import java.util.Arrays;

public class programmers_K번째수 {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array, commands));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int count = 0; count < commands.length; count++) {
            int i = commands[count][0];
            int j = commands[count][1];
            int[] arr = new int[j - i + 1];
            for (int l = 0; l < arr.length; l++) {
                arr[l] = array[i - 1];
                i++;
            }
            Arrays.sort(arr);
            int k = commands[count][2];
            answer[count] = arr[k - 1];
        }
        return answer;
    }
}
