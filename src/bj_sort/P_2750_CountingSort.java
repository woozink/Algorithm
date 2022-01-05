package bj_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2750_CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001];

        /*
        range = -1000 ~ 1000
        0은 index[1000]을 의미함
         */
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        // 정렬과정이 필요 x

        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }
    }
}
