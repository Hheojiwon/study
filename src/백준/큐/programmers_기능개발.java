package 백준.큐;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class programmers_기능개발 {

    public static void main(String[] args) {
        int[] progresses = {90,30,55};
        int[] speeds = {2,1};
        solution(progresses, speeds);
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                deque.offer((100 - progresses[i]) / speeds[i]);
            } else {
                deque.offer(((100 - progresses[i]) / speeds[i]) + 1);
            }
        }

        int day = deque.poll();
        int count = 1;

        while (!deque.isEmpty()) {
            if (day >= deque.getFirst()) {
                count++;
                deque.poll();
            } else {
                list.add(count);
                count = 1;
                day = deque.poll();
            }
        }
        list.add(count);


        return list.stream().mapToInt(i -> i).toArray();
    }

}
