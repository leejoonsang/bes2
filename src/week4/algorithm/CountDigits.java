// codeUp 1278: 자릿수 세기
package week4.algorithm;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String str = String.valueOf(n);

            System.out.println(str.length());

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
