package bj_if문;
import java.util.Scanner;

public class P_1330_TwoComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();
        /*
        if (A>B) System.out.println(">");
        else if(A<B) System.out.println("<");
        else System.out.println("==");
        기본 방법
         */

        String str = (A>B) ? ">" : ((A<B) ? "<" : "==");
        System.out.println(str);
    }
}
