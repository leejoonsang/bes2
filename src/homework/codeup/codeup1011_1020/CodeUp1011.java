package homework.codeup.codeup1011_1020;

import java.util.Scanner;

public class CodeUp1011 {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            System.out.println(c);
        }catch(Exception e){
            System.out.println("다시 입력하세요.");
        }

    }
}
