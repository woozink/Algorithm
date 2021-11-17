package bj_For문;
import java.util.Scanner;

public class P_8393_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add =0;

        for (int a = 1; a<=n; a++){
            add+=a;
        }
        System.out.println(add);

    }
}
