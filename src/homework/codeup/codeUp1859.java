package homework.codeup;

import java.util.Scanner;

public class codeUp1859 {

    public static void printAsterik(int n, String temp){
        if(n == temp.length()-1){
            System.out.println("----------");
            return;
        }
        System.out.println(temp);
        printAsterik(n, temp + "*");
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            printAsterik(n, "*");

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
