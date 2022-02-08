package bj_priorityqueue;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class P_11279_MaximumHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        int val = 0;

        for (int i = 0; i < n; i++) {
            val = Integer.parseInt(br.readLine());
            if (val != 0) {
                q.add(val);
            } else if (q.isEmpty()) {
                bw.write("0\n");
            } else {
                bw.write(q.poll() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
