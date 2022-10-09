package homework.codeup;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String date = sc.next();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.M.d");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");

            System.out.println(sdf2.format(sdf.parse(date)));

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
