package bj_For문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2742_BackOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = N; i>=1; i--){
            System.out.println(i);
        }

    }
}
