package bj_divisionconquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2740_MatrixMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int i =0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j =0; j < M; j ++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine()," ");
        // B 행렬 입력

        st.nextToken(); // M값으로 같은 수이기 때문에 버려도 상관 없다.

        int K = Integer.parseInt(st.nextToken());

        int[][] B = new int[M][K];

        for(int i = 0; i < M; i ++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < K; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0; i < N; i++){
            for(int j = 0; j < K; j++){
                int sum = 0;
                for(int k =0; k < M; k++){
                    sum += A[i][k] * B[k][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
