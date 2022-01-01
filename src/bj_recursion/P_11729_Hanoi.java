package bj_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_11729_Hanoi {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void Hanoi(int N, int start, int mid, int to) {
        //이동할 원반의 수가 1개라면 ?
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        // Step 1 : N-1 개를 A에서 B로 이동
        Hanoi(N - 1, start, to, mid);

        // step 2 : 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        //strp 3 : N-1 개를 B에서 C로 이동
        Hanoi(N - 1, mid, start, to);
    }
}
