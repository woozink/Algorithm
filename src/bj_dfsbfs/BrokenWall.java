package bj_dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BrokenWall {
    static int n, m;
    static int[][] map, brokenwall, count;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        brokenwall = new int[n][m];
        count = new int [n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(s[j]);
                brokenwall[i][j] = 2;
            }
        }

        bw.write(String.valueOf(bfs(0, 0)));
        bw.flush();
        br.close();
        bw.close();
    }

    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{x,y});
        brokenwall[x][y] = 0;
        count [x][y] = 1;

        while(!q.isEmpty()){
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            q.poll();
            //제일 처음 n,m에 도착할 떄의 count 값을 리턴.
            if(cx == -1 && cy ==-1){
                return count[n-1][m-1];
            }
            for(int i =0; i <4; i ++){
                int nx = cx +dx[i];
                int ny = cy + dy[i];

                if(nx>=0&&ny>=0&&nx<n&&ny<m){
                    if(map[nx][ny] ==1 && brokenwall[cx][cy]==0){
                        q.offer(new int[]{nx,ny});
                        brokenwall[nx][ny]= 1;
                        count[nx][ny] = count[cx][cy]+1;

                    }
                }else if(map[nx][ny] ==0 && brokenwall[nx][ny]>brokenwall[cx][cy]){
                    q.offer(new int[]{nx,ny});
                    brokenwall[nx][ny] = brokenwall[cx][cy];
                    count[nx][ny] = count[cx][cy] +1;
                }
            }
        }
        return -1;
    }
}
