package bj_basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P_9020_Gold {
    public static boolean[] PRIME = new boolean[10001];

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        getPrime();
//
//        int T = Integer.parseInt(br.readLine());
//
//        while (T-- > 0) {
//            int n = Integer.parseInt(br.readLine());
//            int firstPartition = n / 2;
//            int secondPartition = n / 2;
//
//            while (true) {
//
//                //두 파티션이 모두 소수일 경우
//                if (!PRIME[firstPartition] && !PRIME[secondPartition]) {
//                    System.out.println(firstPartition + " " + secondPartition);
//                    break;
//                }
//                firstPartition--;
//                secondPartition++;
//            }
//        }secondPartition
    }

    public static void getPrime() {
        PRIME[0] = PRIME[1] = true;
        List<Integer> numbers = Arrays.asList(1,2,6,30,20,7,5,3,1);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 2; i <= Math.sqrt(PRIME.length); i++) {
            if (PRIME[i])
                continue;
            for (int j = i * i; j < PRIME.length; j += i) {
                PRIME[j] = true;
            }
        }
    }
}
