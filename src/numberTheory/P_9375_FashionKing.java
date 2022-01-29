package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P_9375_FashionKing {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while ( T-->0){

            HashMap<String, Integer> hm = new HashMap<>(); //종류, 개수

            int N = Integer.parseInt(br.readLine()); // 입력받는 옷의 개수

            while ( N-- > 0){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                st.nextToken(); // 옷이름은 필요 x

                String kind = st.nextToken(); // 옷종류

                // 해당 옷이 해시맵에 있을 때
                // 해시맵에 저장되어있던 해당 종류의 개수르 +1 증가시킨다.
                // 해당 종류의 옷이 해시맵에 없는 경우
                // 해당 종류와 개수 1을 넣는다.

                if(hm.containsKey(kind)){
                    hm.put(kind, hm.get(kind) + 1);
                }
                else {
                    hm.put(kind, 1);
                }

            }

            int result = 1;

            for (int val : hm.values()){
                result *= (val +1);

            }
            sb.append(result -1 ).append('\n');

        }
        System.out.println(sb);
    }
}
