package bj_function;


public class P_15596_AddN {
    static long sum(int[] numbers) {
        long sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] b = new int[]{1, 2, 3};

        System.out.println(sum(b));


    }
}
