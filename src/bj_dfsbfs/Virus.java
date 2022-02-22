package bj_dfsbfs;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Virus {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        LinkedList<Integer>[] adjList = new LinkedList[n+1];
        for(int i = 0; i <= n; i++){
            adjList[i] = new LinkedList<Integer>();
        }
        boolean[] visited = new boolean[n+1];

        StringTokenizer st;

        //인접 리스트 구성
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjList[v1].add(v2);
            adjList[v2].add(v1);

        }

        //모든 각각의 노드에 대해 연결된 노드들의 번호를 정렬하는 코드이다.

        for(int i = 1; i <= n; i++){
            Collections.sort(adjList[i]);
        }
        dfs(adjList, visited, 1);

        bw.write(String.valueOf(count));
    }

    static void dfs(LinkedList<Integer>[]adjList, boolean[]visited, int v){
        //방문했음을 표시
        visited[v] = true;
        //현재 노드 v에 연결된 모든 노드들에 대하여 방문되지 않았다면 개위를 수행한다.
        Iterator<Integer> iter = adjList[v].listIterator();

        while(iter.hasNext()){
            int nextVisit = iter.next();
            if(!visited[nextVisit]){
                count ++;
                dfs(adjList, visited, nextVisit);
            }
        }
    }
}
