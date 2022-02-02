package bj_queuedeq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P_1021_RotatingQu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 1부터 N까지 덱에 담아ㅈ둔다.
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] seq = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            int targetIdx = deque.indexOf(seq[i]);
            int halfIdx;

            if (deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2 - 1;
            } else {
                halfIdx = deque.size() / 2;
            }

            if (targetIdx <= halfIdx) {
                for (int j = 0; j < targetIdx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
