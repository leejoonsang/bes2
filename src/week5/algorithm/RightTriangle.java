package week5.algorithm;

import java.util.Scanner;

public class RightTriangle {

    public void printAsterisk(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            RightTriangle rightTriangle = new RightTriangle();
            rightTriangle.printAsterisk(n);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
