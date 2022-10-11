package week4.algorithm;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;

            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}

/* programmers 버전
import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
 */