package bj_For문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2438_Star_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i =1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
