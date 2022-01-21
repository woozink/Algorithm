package bj_dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1149_RGBDistance {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Cost = new int[N][3];
        DP = new int[N][3];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            Cost[0][Red] = Integer.parseInt(st.nextToken());
            Cost[0][Green] = Integer.parseInt(st.nextToken());
            Cost[0][Blue] = Integer.parseInt(st.nextToken());

        }
        DP[0][Red] = Cost[0][Red];
        DP[0][Green] = Cost[0][Green];
        DP[0][Blue] = Cost[0][Blue];

        System.out.println(Math.min(PaintCost(N - 1, Red), Math.min(PaintCost(N - 1, Green), PaintCost(N - 1, Blue))));
    }

    static int PaintCost(int N, int color) {

        if (DP[N][color] == 0) {

            if (color == Red) {
                DP[N][Red] = Math.min(PaintCost(N - 1, Green), PaintCost(N - 1, Blue)) + Cost[N][Red];
            } else if (color == Green) {
                DP[N][Green] = Math.min(PaintCost(N - 1, Red), PaintCost(N - 1, Blue)) + Cost[N][Green];
            } else {
                DP[N][Blue] = Math.min(PaintCost(N - 1, Red), PaintCost(N - 1, Green)) + Cost[N][Blue];
            }
        }
        return DP[N][color];
    }
}

