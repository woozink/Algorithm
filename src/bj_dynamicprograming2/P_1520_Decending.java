package bj_dynamicprograming2;

import java.io.*;
import java.util.StringTokenizer;

public class P_1520_Decending {
    static int[][] way;
    static int[][] dp;
    static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        way = new int[m][n];
        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                way[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        bw.write(String.valueOf(solution(0, 0)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution(int x, int y) {
        //destination
        if (x == m && y == n - 1) {
            return 1;
        }
        if (dp[x][y] == -1) {
            dp[x][y] = 0;
            // move up
            if (x > 0 && way[x][y] > way[x - 1][y]) {
                dp[x][y] += solution(x - 1, y);
            }
            // move down
            if (x < m - 1 && way[x][y] > way[x + 1][y]) {
                dp[x][y] += solution(x + 1, y);
            }

            //move left
            if (y > 0 && way[x][y] > way[x][y - 1]) {
                dp[x][y] += solution(x - 1, y);
            }

            //move right
            if (y > 0 && way[x][y] > way[x][y + 1]) {
                dp[x][y] += solution(x, y + 1);
            }
        }
        return dp[x][y];
    }
}
