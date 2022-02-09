package bj_dynamicprograming2;

import java.io.*;
import java.util.StringTokenizer;

public class P_11066_MergeFiles {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int file[] = new int[k];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                file[j] = Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(solution(file)));
            bw.newLine();
        }
    }

    static int solution(int[] file) {
        int size = file.length;
        int[][] dp = new int[size][size];
        int[] sum = new int[size];
        sum[0] = file[0];

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + file[i];
        }
        for (int i = 0; i < file.length - 1; i++) {
            dp[i][i + 1] = file[i] + file[i + 1];
        }
        for (int gap = 2; gap < size; gap++) {
            for (int i = 0; i + gap < size; i++) {
                int j = i + gap;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sumDist(sum, i, j));
                }
            }
        }
        return dp[0][size - 1];

    }

    static int sumDist(int[] sum, int start, int end) {
        if (start == 0) {
            return sum[end];
        } else {
            return sum[end] - sum[start - 1];
        }
    }
}

