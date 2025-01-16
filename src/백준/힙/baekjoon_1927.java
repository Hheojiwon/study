package 백준.힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> heap = new ArrayList<>();
        heap.add(0);

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(br.readLine());
            if (X == 0) {
                System.out.println(delete(heap));
            } else {
                insert(heap, X);
            }
        }
    }

    public static void insert(List<Integer> heap, int number) {
        heap.add(number);
        int index = heap.size() - 1;

        while (index > 1 && heap.get(index / 2) > heap.get(index)) {
            int parentValue = heap.get(index / 2);
            heap.set(index / 2, heap.get(index));
            heap.set(index, parentValue);
            index /= 2;
        }
    }

    public static int delete(List<Integer> heap) {
        if (heap.size() - 1 < 1) {
            return 0;
        }

        int deleteItem = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 1;

        while (index * 2 < heap.size()) {
            int minIndex = index * 2;
            if (minIndex + 1 < heap.size() && heap.get(minIndex) > heap.get(minIndex + 1)) {
                minIndex = minIndex + 1;
            }

            if (heap.get(index) <= heap.get(minIndex)) {
                break;
            }

            int tmp = heap.get(index);
            heap.set(index, heap.get(minIndex));
            heap.set(minIndex, tmp);

            index = minIndex;
        }

        return deleteItem;
    }
}
