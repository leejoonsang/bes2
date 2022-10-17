package week5.algorithm;

import java.util.Scanner;

public class Pyramid {

    public void print(int n){

        for (int i=0; i<n; i++){
            // 공백 출력
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            // 별표 출력
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Pyramid pyramid = new Pyramid();
            pyramid.print(n);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
