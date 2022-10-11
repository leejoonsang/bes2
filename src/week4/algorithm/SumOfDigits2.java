// codeUp 1620: 자릿수의 합
package week4.algorithm;

import java.util.Scanner;

public class SumOfDigits2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sum = 0; int temp = 0;
            int result = 0;

            while(n > 0){
                sum += n % 10;
                n /= 10;
            }

            while(sum > 0){
                temp += sum % 10;
                sum /= 10;
            }

            String str = String.valueOf(temp);
            for(int i=0; i<str.length(); i++){
                result += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            System.out.println(result);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
