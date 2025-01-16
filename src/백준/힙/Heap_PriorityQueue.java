package 백준.힙;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_PriorityQueue {

    public static void main(String[] args) {
        Heap_PriorityQueue heapPriorityQueue = new Heap_PriorityQueue();
        heapPriorityQueue.heap();
    }

    public void heap(){
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        System.out.println("minHeap:");
        runHeap(minHeap);

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("maxHeap:");
        runHeap(maxHeap);
    }
    public void runHeap(PriorityQueue<Integer> heap){
        heap.add(1);
        heap.add(7);
        heap.add(4);
        heap.add(2);
        heap.add(3);
        while(heap.size()>=1){
            System.out.println(heap.poll());
        }
    }
}
