package bj_dynamicprogramming2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_2293_Coin1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];

        for(int i = 0; i < n; i ++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin);
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i =0; i < n; i ++){
            for(int j = coin[i]; j <=k; j++){
                dp[j] += dp[j -coin[i]];
            }
        }
        bw.write(dp[k] + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
