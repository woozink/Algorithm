package bj_dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato2 {

    static int n,m,h;
    static int [][][] box;
    static boolean [][][] visited;
    static Queue<int[]> q= new LinkedList<int[]>();

    //위 아래 상하좌우
    static int[] dx = {0,0,0,0,-1,1};
    static int[] dy = {0,0,1,-1,0,0};
    static int[] dz = {1,-1,0,0,0,0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());


        box = new int[n][m][h];
        visited = new boolean[m][n][h];

        for(int i =0; i < h; i++){
            for(int j= 0; j < n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k<m; k++){
                    int t = Integer.parseInt(st.nextToken());
                    box[j][k][i] = t;
                    //모든 시작점을 enqueue
                    if(t == 1){
                        q.offer(new int[]{j,k,i});
                        visited[j][k][i]= true;
                    }
                }
            }
        }
        bfs();
        int answer = 0;
        for(int i =0 ; i < h; i++){
            for(int j=0; j < n; j ++){
                for(int k = 0; k < h; k ++){
                    //배열의 0이 존재하면 -1출력
                    if(box[j][k][i] ==0){
                        bw.write("-1\n");
                        System.exit(0);
                    }
                    else answer = Math.max(answer, box[j][k][i]);
                }
            }
        }
        bw.write(String.valueOf(answer-1));
    }
    static void bfs(){
        while(!q.isEmpty()){
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            int cz = q.peek()[2];
            q.poll();

            for(int i = 0; i<6; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                int nz = cz + dz[i];
                if(nx>=0&&ny>=0&&nz>=0&&nx<n&&ny<m&&nz<h){
                    if(box[nx][ny][nz] == 0 && !visited[nx][ny][nz]){
                        q.offer(new int[]{nx,ny,nz});
                        visited[nx][ny][nz] = true;
                        box[nx][ny][nz] = box[cx][cy][cz]+1;
                    }
                }
            }
        }
    }
}
