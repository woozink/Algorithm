package bj_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1065_OneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(artimetic_sequence(Integer.parseInt(br.readLine())));

    }
    public static int artimetic_sequence(int num) {
        int cnt = 0; //한수 카운트

        if (num <100){
            return num;
        }

        else {
            cnt = 99;
            if (num ==1000){ //예외처리
                num = 999;
            }
            for (int i =100; i<= num; i++){
                int hun = i/100;
                int ten = (i/10) % 10;
                int one = i %10;

                if ((hun - ten) == (ten-one)) {
                    cnt++;
                }
            }
        }
        return cnt;


    }
}
