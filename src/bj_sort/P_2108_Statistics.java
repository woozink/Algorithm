package bj_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2108_Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        for(int i =0; i < N; i++){
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if(max < value){
                max = value;
            }
            if(min>value){
                min = value;
            }
        }

        int count = 0; // 중앙값 빈도 누적 수
        int mode_max = 0; // 최빈값의 최댓값

        //이전의 동일한 최빈 값이 1번만 등장했을 경우 true, 아닐경우 false
        boolean flag = false;

        for (int i = min + 4000; i <= max +4000; i++){

            if(arr[i] > 0){
                // 중앙값 찾기 누적횟수가 전체 길이의 절반에 못미친다면
                if(count < (N+1)/2){
                    count += arr[i];
                    median = i -4000;
                }
                //최빈 값 == 이전 최빈값 보다 현재 값의 빈도수가 더 높을 경우
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i -4000;
                    flag = true; //첫 등장이므로 true로 변경
                }
                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
                else if(mode_max == arr[i] && flag ==true){
                    mode = i -4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);

    }
}
