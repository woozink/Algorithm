package bj_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P_10773_Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer>stack = new Stack<Integer>();

        int K = Integer.parseInt(br.readLine());

        for(int i =0; i < K; i++){
            int number = Integer.parseInt(br.readLine());

            if(number == 0){// 0이라면 스택에 저장된 top원소를 지운다.
                stack.pop();
            }
            else{
                //ex) stack.add(numnber);
                stack.push(number);
            }
        }
        int sum = 0;

        for(int x : stack) {
            sum += x;
        }

        System.out.println(sum);
    }
}
