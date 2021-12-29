package bj_basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_3053_Taxi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Double.parseDouble(br.readLine());

        System.out.println(R * R * Math.PI); //유클리드 원의 넓이
        System.out.println(2 * R * R); //택시기하학 원의 넓이
    }
}
