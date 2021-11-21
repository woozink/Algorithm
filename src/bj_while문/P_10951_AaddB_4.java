package bj_while문;

import java.io.*;
import java.util.StringTokenizer;

public class P_10951_AaddB_4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int x = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(tokenizer.nextToken());
                if (num < x) bw.write(num + " ");
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
