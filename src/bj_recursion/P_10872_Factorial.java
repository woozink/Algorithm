package bj_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_10872_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = factorial(N);
        System.out.println(sum);
    }

    public static int factorial(int N) {
        if (N <= 1) return 1;
        return N * factorial(N - 1);
    }
}

/*
while (N!= 0){
    sum = sum *N;
    N--;
}
반복문으로 풀 떄
 */
