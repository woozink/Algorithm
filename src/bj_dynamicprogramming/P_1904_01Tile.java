package bj_dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1904_01Tile {
    public static int[]dp = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        // -1로 초기화
        for(int i = 3; i < dp.length; i++){
            dp[i] = -1;
        }
        System.out.println(Tile(N));
    }
    public static int Tile(int N) {
        if(dp[N] == -1){
            dp[N] = (Tile(N-1) + Tile((N-2)))% 157462;
        }
        return dp[N];
    }
}
