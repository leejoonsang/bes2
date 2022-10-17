package homework.codeup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeUp1022 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            System.out.println(str);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
