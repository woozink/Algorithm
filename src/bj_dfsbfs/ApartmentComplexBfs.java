package bj_dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ApartmentComplexBfs {
    static boolean[][] visited;
    static int map[][];
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};
    static int n, count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        String[] s;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    bfs(i, j);
                    pq.offer(count);
                }
            }
        }
        bw.write(pq.size() + "\n");
        while (!pq.isEmpty()) {
            bw.write(pq.poll() + "\n");
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        count ++;
        while(!q.isEmpty()){
            int curX = q.peek()[0];
            int curY = q.peek()[1];
            q.poll();
            for(int i = 0; i < 4; i ++){
                int nx = curX +dx[i];
                int ny= curY + dy[i];
                if(nx >= 0 && ny >= 0 && nx<n && ny <n){
                    if(map[nx][ny] ==1 && !visited[nx][ny]){
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count ++;
                    }
                }
            }
        }
    }
}

