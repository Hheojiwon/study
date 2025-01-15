package 백준.힙;

import java.util.ArrayList;

public class minHeap {
    private ArrayList<Integer> heap;

    public minHeap() {
        heap = new ArrayList<Integer>();
        heap.add(0); // 0번째 인덱스는 사용하지 않음
    }

    public void insert(int number) {
        heap.add(number);
        int p = heap.size() - 1; // 새로 삽입한 노드의 인덱스
        while (p > 1 && heap.get(p / 2) > heap.get(p)) {
            // 부모가 자식보다 크다면?
            int tmp = heap.get(p / 2);
            heap.set(p / 2, number);
            heap.set(p, tmp);

            p /= 2; //인덱스 부모 노드 인덱스 값으로 변경
        }
    }

    public int delete() {
        if (heap.size() - 1 < 1) {
            return 0;
        }

        int deleteItem = heap.get(1); // 루트 노드 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 1; // 루트 노드 인덱스

        while ((index * 2) < heap.size()) {
            int min = heap.get(index * 2); //왼쪽 자식 인덱스 값
            int minIndex = index * 2;

            if (((index * 2 + 1) < heap.size()) && min > heap.get(index * 2 + 1)) {
                min = heap.get(index * 2 + 1);
                minIndex = index * 2 + 1;
            }

            if (min > heap.get(index)) { // 부모가 더 작은 경우
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
