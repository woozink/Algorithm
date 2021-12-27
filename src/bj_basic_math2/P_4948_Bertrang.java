package bj_basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_4948_Bertrang {
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {
        /*
        n > 123456 이므로 n은 최대 246912 이다.
        0 부터 시작하므로 246912+1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int count = 0;

            for (int i = n+1; i<=2*n; i++){
                if(!prime[i]) count ++;
            }
            System.out.println(count);
        }
    }
    public static void get_prime() {
        // 0 과 1 은 소수가 아니므로 true
        prime[0] = prime[1] =true;

        for (int i =2; i<= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i* i; j < prime.length; j += i){
                prime[j]=true;
            }

        }
    }
}
