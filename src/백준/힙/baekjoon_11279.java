package 백준.힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class baekjoon_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X == 0) {
                if (heap.isEmpty()) heap.add(0);
                System.out.println(heap.poll());
            } else {
                heap.add(X);
            }
        }
    }
}
