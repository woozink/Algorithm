package bj_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1110_AddCycle {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int cnt = 0;
            int copy = N;

            while (true) {
                N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
                cnt++;

                if (copy == N) {
                    break;
                }
            }
            System.out.println(cnt);
        } catch (IOException e) {
        }
    }
}
