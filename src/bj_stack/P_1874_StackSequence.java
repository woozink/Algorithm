package bj_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P_1874_StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //출력할 결과물 저장

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start =0;

        //N번 반복

        while( N -- > 0){
            int value = Integer.parseInt(br.readLine());

            if(value > start){
                //start + 1부터 입력받은 value 까지 push를 한다.
                for (int i = start +1; i<= value; i++){
                    stack.push(i);
                    sb.append('+').append('\n');

                }
                start = value; //다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            //top 에 있는 원소가 입력받은 값과 같지 않은 경우
            else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
