package bj_array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_8958_OX_Quiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        String[] arr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < testCase; i++) {

            int cnt = 0;    //연속횟수
            int sum = 0;    //누적합산

            String targetString = arr[i];

            for (int j = 0; j < targetString.length(); j++) {

                if (targetString.charAt(j) == '0') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }

            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
