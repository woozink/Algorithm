package bj_dfsbfs;

import javax.management.StringValueExp;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato1 {

    static int n,m;
    static int [][] box;
    static boolean[][] visited;
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static Queue<int[]> q = new LinkedList<int[]>();
    static ArrayList<int[]> StartPoint = new ArrayList<int[]>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];
        visited = new boolean[n][m];

        for(int i =0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int t = Integer.parseInt(st.nextToken());
                box[i][j] =t;
                if(t == 1){
                    StartPoint.add(new int[]{i,j});

                }
            }
        }
        bfs();

        int answer = 0;
        for(int i = 0; i < n; i ++){
            for(int j =0; j < m; j ++){
                //배열에 0 이 존재하면 익을 수 없는 토마토가 있으므로 -1 출력
                if(box[i][j] == 0){
                    bw.write("-1\n");
                    System.exit(0);
                }
                else{
                    answer = Math.max(answer,box[i][j]);

                }
            }
        }
        bw.write(String.valueOf(answer-1));
    }
    static void bfs(){
        //모든 시작점을 enqueue
        for(int[]a : StartPoint){
            q.offer(new int[]{a[0],a[1]});
            visited[a[0]][a[1]] = true;
        }
        while(!q.isEmpty()){
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            q.poll();
            for(int i =0; i < 4; i++){
                int nx = cx +dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx <n && ny <m){
                    if(box[nx][ny] ==0 && !visited[nx][ny]){
                        q.offer(new int[]{nx, ny});
                        visited[cx][cy] = true;
                        box[nx][ny] = box[cx][cy]+1;
                    }
                }
            }
        }
    }
}
