package homework.codeup;

import java.util.Scanner;

public class CodeUp1012 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            float f = sc.nextFloat();
            System.out.printf("%f", f);
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
