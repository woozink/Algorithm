package bj_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2577_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int val = num1 * num2 * num3;

        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }
        for (int v : arr) {
            System.out.println(v);
        }

    }
}
