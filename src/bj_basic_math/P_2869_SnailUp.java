package bj_basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2869_SnailUp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;
        System.out.println(day);
    }
}
