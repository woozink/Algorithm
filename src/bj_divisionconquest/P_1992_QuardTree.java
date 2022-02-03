package bj_divisionconquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1992_QuardTree {

    public static int[][] img;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        img = new int[N][N];

        for(int i =0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                img[i][j] = str.charAt(j)-'0';
            }
        }QuardTree(0,0,N);
        System.out.println(sb);
    }
    public static void QuardTree(int x, int y, int size){
        if(isPossible (x,y,size)){
            sb.append(img[x][y]);
            return;
        }
        int newSize = size/2;
        sb.append('(');
        QuardTree(x,y,newSize);
        QuardTree(x,y+newSize,newSize);
        QuardTree(x+newSize,y,newSize);
        QuardTree(x+newSize,y+newSize,newSize);
        sb.append(")");
    }
    public static boolean isPossible(int x, int y, int size){
        int value = img[x][y];

        for(int i =x; i < x+ size; i++){
            for(int j = y; j<j+size; j++){
                if(value != img[x][y]){
                    return false;
                }
            }
        }
        return true;
    }
}
