package bj_divisionconquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_6549_Hisrogram {
    public static int[] histogram;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            if (N == 0) break;
            histogram = new int[N];
            for (int i = 0; i < N; i++) {
                histogram [i] = Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(0, N - 1)).append("\n");
            histogram = null;
        }
        System.out.println(sb);
    }

    public static long getArea(int lo, int hi) {
        if (lo == hi) return histogram[lo];
        int mid = (lo + hi) / 2;
        long leftArea = getArea(lo, mid);
        long reightArea = getArea(mid + 1, hi);
        long max = Math.max(leftArea, reightArea);
        max = Math.max(max, getMidArea(lo, hi, mid));
        return max;
    }

    public static long getMidArea(int lo, int hi, int mid) {
        int toleft = mid;
        int toRight = mid;
        long height = histogram[mid];
        long maxArea = height;
        while (lo < toleft && toRight < hi) {
            if (histogram[toleft - 1] < histogram[toRight + 1]) {
                toRight++;
                height = Math.min(height, histogram[toRight]);
            } else {
                toleft--;
                height = Math.min(height, histogram[toleft]);
            }
        }
        while (toRight < hi) {
            toRight++;
            height = Math.min(height, histogram[toRight]);
            maxArea = Math.max(maxArea, height * (toRight - toleft + 1));
        }
        while (lo < toleft) {
            toleft--;
            height = Math.min(height, histogram[toleft]);
            maxArea = Math.max(maxArea, height * (toRight - toleft + 1));
        }
        return maxArea;
    }
}


