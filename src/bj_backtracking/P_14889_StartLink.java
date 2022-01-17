package bj_backtracking;

import java.io.IOException;

public class P_14889_StartLink {
    static int N;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

    }
    // idx는 인덱스, count는 조합의 개수(=재귀의 깊이)
    static void combi(int idx, int count){
        //팀 조합이 완성될 경우
        if(count == N/2){
            // 방문한 팀과 방문하지 않은 팀은 각각 나누어서
            //각 팀의 점수를 구한 뒤 최솟값을 찾는다.
            diff();
            return;
        }
        for (int i = idx; i < N; i++){
            //방문 x
            if(!visit[i]){
                visit[i] = true; //방문으로 변경
                combi(i+1, count +1); //재귀호출
                visit[i] = false; //재귀가 끝나면 비방문으로 변경
            }
        }
    }
    //두 팀의 능력치 차이를 계산하는 함수
    static void diff(){
        int team_start = 0;
        int team_link = 0;

        for (int i =0; i < N-1; i++){
            for (int j = i+1; j < N; j++) {
                // i번째 사람과 j번째 사람이 true 라면 스타트팀으로 점수 플러스
                if (visit[i] == true && visit[j] == true){
                    team_start += map[i][j];
                    team_start += map[j][i];
                }
                else if(visit[i] == false && visit[j] == false){
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
       }
        int val = Math.abs(team_start = team_link);

        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }
        Min = Math.min(val, Min);
    }
}
