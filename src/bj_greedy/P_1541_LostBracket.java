package bj_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1541_LostBracket {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; // 초기 상태 여부를 확인하기 위한 값
        StringTokenizer subtraction = new StringTokenizer(br.readLine(),"-");

        while(subtraction.hasMoreTokens()){
            int temp = 0;

            //뺄샘으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(),"+");

            //덧셈으로 나뉜 토큰들을 모두 더한다.
            while (addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }
            else{
                sum -= temp;
            }
        }
        System.out.println(sum);


    }
}
