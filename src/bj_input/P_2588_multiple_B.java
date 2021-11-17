package bj_input;
import java.util.Scanner;

public class P_2588_multiple_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* < 1번 방법 integer 형으로 바꾸어서 각각의 자리수에 대한 값을 구하는 방법>
        int A = sc.nextInt();
        String B = sc.next();

        sc.close();

        System.out.println(A * (B.charAt(2)- '0'));
        System.out.println(A * (B.charAt(1)- '0'));
        System.out.println(A * (B.charAt(0)- '0'));
        System.out.println(A* Integer.parseInt(B));
        */

        /* int 형은 소수점을 포함하지 않는 다는 점을 유의해서 수식화한다.
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
         */


    }
}
