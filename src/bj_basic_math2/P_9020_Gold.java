package bj_basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_9020_Gold {
    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int T = Integer.parseInt(br.readLine());

        while (T-->0) {
            int n = Integer.parseInt(br.readLine());
            int first_partition = n/2;
            int second_partition = n/2;

            while (true){

                //두 파티션이 모두 소수일 경우
                if(!prime[first_partition] && !prime[second_partition]){
                    System.out.println(first_partition + " " + second_partition);
                    break;
                }
                first_partition--;
                second_partition++;
            }
        }
    }
    public static void get_prime(){
        prime[0] = prime[1] = true;

        for (int i =2; i<= Math.sqrt(prime.length); i++){
            if(prime[i])
                continue;
            for (int j = i*i; j < prime.length; j+=i){
                prime[j]=true;
            }
        }
    }
}
