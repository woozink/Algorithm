package bj_priorityqueue;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P_1655_MiddleNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());

        int val = 0;

        for (int i = 0; i < n; i++) {
            val = Integer.parseInt(br.readLine());

            if (maxHeap.size() <= minHeap.size()) {
                maxHeap.offer(val);
            } else {
                minHeap.offer(val);
            }

            if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                maxHeap.offer(minHeap.poll());
                minHeap.offer(maxHeap.poll());
            }
            bw.write(maxHeap.peek() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
