package bj_dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* dp는 기본적으로 중복으로 여러번 계산하는 것을 막기 위해서 고안된 방법입니다.
* 개념이 길긴하지만 간단하게 쉬운 사례를 들면 파스칼의 삼각형을 생각하보면 쉬운데 파스칼 삼각형은 이항계수의 앞의 계수를 구할때 사용하는
* 방법인데 이게 삼각형의 모형을 띄고 있다보니, 중복되는 경우가 발생합니다.
* 그새서 이경우 재귀적으로 계산할 때 이 중복 계산이 자꾸 시간을 잡아 먹게 되어서 시간 초과가 나는 경우가 발생합니다.
* 즉, dp는 중복 값이 나올 때 마다 이미 계산한 값이라면 계산하지 않고 값을  튀어나오는 방식을 차용합니다.
* 우리는 이 개념 중 가장 큰 것은 이 중복값을 미리 계산해서 그것을 미리 계산 처리 하는 것을 중점에 두고 풀어야합니다.
*
* */
public class P_2579_UptoStair {
    static Integer dp[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        arr = new int[N+1];

        for(int i =1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = arr[0]; // 디폴트 값이 null 이므로 0dmf 초기화해주어야합니다.
        dp[1] = arr[1];

        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(N));
    }

    static int find(int N) {
        // 아직 탐색하지 않은 N 번째 계단일 경우
        if(dp[N] == null) {
            dp[N] = Math.max(find(N-2), find(N-3) + arr[N-1]) + arr[N];
        }

        return dp[N];
    }
}
