package bj_dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MiroSearch {
    static int n,m;
    static int [][] maze;
    static boolean[][] visited;
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean [n][m];

        for(int i = 0; i < n; i++){
            String[]s = br.readLine().split("");
            for(int j =0; j < m; j++){
                maze[i][j] = Integer.parseInt(s[j]);
            }

        }
        bfs(0,0);
        bw.write(String.valueOf(maze[n-1][m-1]));
        bw.flush();
        br.close();
        bw.close();
    }
    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] {x,y});

        while(!q.isEmpty()){
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            q.poll();

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx>=0 && ny >= 0 && nx < n && ny <n){
                    if(maze[nx][ny] == 1 && !visited[nx][ny]){
                        q.offer(new int[] {nx, ny});
                        visited[cx][cy] = true;
                        maze[nx][ny] = maze[cx][cy]+1;
                    }

                }

            }
        }
    }
}
