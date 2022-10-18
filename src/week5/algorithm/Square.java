package week5.algorithm;

import java.util.Scanner;

public class Square {

    public void printSquare(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Square square = new Square();
            square.printSquare(n);
        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
