package bj_character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_10809_FindAp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳의 갯수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
