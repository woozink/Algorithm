package bj_For문;

import java.io.*;

public class P_2741_NOutPut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i =1; i<=N; i++){
            System.out.println(i);
        }
    }
}
