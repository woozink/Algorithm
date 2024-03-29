package bj_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class P_3952_Remainder {
    private static final int TARGET_NUMBER = 42;

    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[TARGET_NUMBER];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % TARGET_NUMBER] = true;
        }

        int count = 0;
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }
        System.out.println(count);

    }
}
