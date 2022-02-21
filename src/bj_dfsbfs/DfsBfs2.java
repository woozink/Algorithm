package bj_dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsBfs2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][2];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }
        bfs(arr, n, m, v);

    }

    static void bfs(int [][] arr, int n, int m, int v)throws IOException{
        Queue<Integer> q = new LinkedList<>();
        boolean end = false;
        int current = v;
        boolean[] visit = new boolean[n +1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        q.offer(current);

        while (!end){
            for(int i = 0; i < m; i ++){
                if(current == arr[i][0]){
                    if(!visit[arr[i][1]]){
                        pq.offer(arr[i][1]);

                    }
                }else if(current == arr[i][1]){
                    if(!visit[arr[i][0]]){
                        pq.offer(arr[i][0]);
                    }
                }
            }
            if(!visit[current]){
                bw.write(current + " ");
                visit[current] = true;
            }
            while (!pq.isEmpty()){
                q.offer(pq.poll());
            }
            if(q.isEmpty()){
                end = true;
            }
            else{
                current = q.poll();
            }
        }
    }
}
