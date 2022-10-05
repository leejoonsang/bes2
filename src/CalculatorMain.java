import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            Calculator calc = new Calculator(a, b);
            calc.getAdd();
            calc.getSub();
            calc.getMul();
            calc.getDiv();
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }

    }
}
