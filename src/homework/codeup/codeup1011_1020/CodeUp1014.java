package homework.codeup.codeup1011_1020;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);
            char c1 = sc.next().charAt(0);
            char c2 = sc.next().charAt(0);
            System.out.println(c2 + " " + c1);

        }catch(Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
