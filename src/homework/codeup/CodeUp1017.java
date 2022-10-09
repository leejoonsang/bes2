package homework.codeup;

import java.util.Scanner;

public class CodeUp1017 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.printf("%d %d %d", a, a, a);
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
