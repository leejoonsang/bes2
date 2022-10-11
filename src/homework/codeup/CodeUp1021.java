package homework.codeup;

import java.util.Scanner;

public class CodeUp1021 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            char data[] = new char[str.length()];

            for(int i=0; i<str.length(); i++) {
                data[i] = str.charAt(i);
            }

            for(int i=0; i<data.length; i++){
                System.out.print(data[i]);
            }


        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
