package homework.codeup;

import java.util.Scanner;

class FindMultiple{
    private int n;
    public FindMultiple(int n) {
        this.n = n;
    }
    public void isMultiple() {

        if(n % 7 == 0) {
            System.out.println("multiple");
        }else {
            System.out.println("not multiple");
        }

    }

}

public class CodeUp1155 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            FindMultiple fm = new FindMultiple(n);
            fm.isMultiple();

        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요. ");
        }

    }
}
