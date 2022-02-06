package bj_binearysearch;

import javax.management.ConstructorParameters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1920_NumSearch {
    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr =new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i< N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for(int i =0; i < M; i ++){
            if(binearySearch(Integer.parseInt(st.nextToken()))>0){
                sb.append(1).append("\n");
            }
            else{sb.append(0).append('\n');}
        }
        System.out.println(sb);
    }

    public static int binearySearch(int key){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int mid = (lo +hi) /2 ;
            if(key<arr[mid]){
                hi = mid -1;
            }
            else if( key > arr[mid]){
                lo = mid +1;
            }
            else return mid;
        }
        return -1;
    }
}
