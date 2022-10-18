package week5.algorithm;

import java.util.Scanner;

public class Rectangle {

    public void printRectangle(int x, int y){

        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            Rectangle rectangle = new Rectangle();
            rectangle.printRectangle(x, y);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
