package 백준.정렬;

import java.util.*;

public class programmers_나누어떨어지는 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        solution(arr, 5);
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
