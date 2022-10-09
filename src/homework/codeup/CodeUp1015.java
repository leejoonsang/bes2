package homework.codeup;

import java.util.Scanner;

public class CodeUp1015 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            float f1 = sc.nextFloat();
            System.out.printf("%.2f", f1);
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
