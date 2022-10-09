package homework.codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        try{
            Scanner sc =  new Scanner(System.in);
            String id = sc.next();

            String idOnlyNum = id.replaceAll("[^0-9]", "");
            System.out.println(idOnlyNum);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
