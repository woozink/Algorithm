package bj_basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_4948_Bertrang {
    public static boolean[] PRIME = new boolean[246913];

    public static void main(String[] args) throws IOException {
        /*
        n > 123456 이므로 n은 최대 246912 이다.
        0 부터 시작하므로 246912+1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrime();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!PRIME[i]) count++;
            }
            System.out.println(count);
        }
    }

    public static void getPrime() {
        // 0 과 1 은 소수가 아니므로 true
        PRIME[0] = PRIME[1] = true;

        for (int i = 2; i <= Math.sqrt(PRIME.length); i++) {
            if (PRIME[i]) continue;
            for (int j = i * i; j < PRIME.length; j += i) {
                PRIME[j] = true;
            }

        }
    }
}
