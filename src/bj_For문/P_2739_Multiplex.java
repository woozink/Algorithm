package bj_For문;
import java.util.Scanner;
public class P_2739_Multiplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        int s;

        for (a =1; a <10; a++){
            s= N*a;
            System.out.println(N+" * "+a+" = "+s);

        }
    }
}
