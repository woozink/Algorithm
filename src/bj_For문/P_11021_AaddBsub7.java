package bj_For문;

import java.io.*;
import java.util.StringTokenizer;

public class P_11021_AaddBsub7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

//        for (int i =1; i<a; i++){
//            st = new StringTokenizer(br.readLine(), " ");
//            System.out.println("Case#"+i+": "+(Integer.parseInt(st.nextToken())
//                    + Integer.parseInt(st.nextToken())))
//        }
        int i = 1;
        while (i < a) {
            st = new StringTokenizer(br.readLine(), " ");
            System.out.println("Case#" + i++ + ": " + (Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())));

        }
        br.close();
    }
}
