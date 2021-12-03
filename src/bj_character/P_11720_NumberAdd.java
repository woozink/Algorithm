package bj_character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
// 두번째로 입력 받는 값의 각 자릿수를 더하는 문제입니다.

public class P_11720_NumberAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum =0;

        for (byte value : br.readLine().getBytes()){ //문자열을 입력 받을 때 각 자릿값을 반환 받을 수 있는 방법
            sum += (value- '0');
        }
        System.out.println(sum);
    }
}
