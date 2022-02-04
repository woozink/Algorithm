package bj_divisionconquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1629_Multiple {
    public static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b));
    }
    public static Long pow(long a, long exponent){
        if(exponent == 1) return a%C;

        long temp = pow(a,exponent/2);

        if(exponent %2 == 1) return (temp*temp)*a %C;
        return temp*temp%C;
    }
}
