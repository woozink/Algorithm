package bj_dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Picture {

    static int n, m;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];
        qu = new LinkedList<>();

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        //배열값 세팅
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //시작
        int count = 0;
        int area = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //0이거나 방문한적이 있으면 생략
                if (arr[i][j] == 0 || visit[i][j]) {
                    continue;
                }
                count++;// 1이고 방문하지 않았으면 시작점이 되는 겁니다잉
                qu.offer(new Pair(i, j)); // 큐에 좌표를 넣어줍니다잉
                visit[i][j] = true; //방문처리합니다잉
                area = 0; //0이면 그림이 끊긴거라서 area에 0을 줍니다.
                while (!qu.isEmpty()) {
                    Pair p = qu.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                            continue;
                        }
                        if (arr[nx][ny] == 1 && !visit[nx][ny]) {
                            qu.offer(new Pair(nx, ny));
                            visit[nx][ny] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);

    }


    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}