package bj_dfsbfs;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class DfsBfs {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int [][] arr = new int[m][2];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }
        dfs (arr, n, m, v);

    }

    static void dfs (int[][] arr, int n, int m, int v)throws IOException{
        Stack<Integer> stk = new Stack<>();
        int current = v;
        boolean[] visit = new boolean[n+1];

        //시작점
        stk.push(0);
        stk.push(current);

        while(stk.peek() != 0){
            //연결된 노드 중 가장 작은 번호의 노드를 탐색
            int next = Integer.MAX_VALUE;
            for(int i = 0; i<m; i ++){
                if(current == arr[i][0]){
                    if(!visit[arr[i][1]]){
                        next = Math.min(next, arr[i][1]);
                    }
                }else if(current == arr[i][1]){
                    if(!visit[arr[i][0]]){
                        next = Math.min(next, arr[i][0]);
                    }
                }
            }

            if(!visit[current]){
                bw.write(current + " ");
                visit[current] = true;
            }
            if(next == Integer.MAX_VALUE){
                stk.pop();
                current = stk.peek();
            }
            else{
                stk.push(next);
                current = next;
            }
        }
    }
}
