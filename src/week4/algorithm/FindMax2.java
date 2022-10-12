package week4.algorithm;

import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int[][] arr2 = new int[9][9];
            int max = 0;

            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr2.length; j++){
                    arr2[i][j] = sc.nextInt();
                    if(arr2[i][j] > max){
                        max = arr2[i][j];
                    }
                }
            }

            System.out.println(max);

            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr2.length; j++){
                    if(arr2[i][j] == max){
                        System.out.println((i+1) + " " + (j+1));
                    }
                }
            }

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
