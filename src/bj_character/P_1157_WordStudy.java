package bj_character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1157_WordStudy {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //영문자의 숫자의 개수
        String s = br.readLine();

        for (int i =0; i < s.length(); i++){ // 첫번째 문자에서 마지막 까지 검사
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                arr[s.charAt(i) - 97]++; //대 소문자 구분 안함 /소문자 97~122 'A'가능
            }else {
                arr[s.charAt(i) - 65]++; //대문자 65 ~ 90  'a'가능
            }
        }

        int max =-1;
        char ch ='?'; //최대 범위
        for (int i =0; i<26; i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char) (i+65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
