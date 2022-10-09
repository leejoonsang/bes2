package homework.codeup;

import java.util.Scanner;

public class CodeUp1013 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + " " + b);
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
