package homework.codeup.codeup1021_1030;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            float num = sc.nextFloat();
            String numStr = Float.toString(num);

            String[] intDecimalPart = numStr.split("\\.");
            String numIntPart = intDecimalPart[0];
            String numDecimalPart = intDecimalPart[1];

            System.out.println(numIntPart);
            System.out.println(numDecimalPart);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
            e.printStackTrace();
        }
    }
}
