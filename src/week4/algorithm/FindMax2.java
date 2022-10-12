package week4.algorithm;

import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int[][] arr2 = new int[9][9];
            int maxValue = 0;
            int[] maxIndex = {0, 0};

            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr2.length; j++){
                    arr2[i][j] = sc.nextInt();
                    if(arr2[i][j] > maxValue){
                        maxValue = arr2[i][j];
                        maxIndex[0] = i;
                        maxIndex[1] = j;
                    }
                }
            }

            System.out.println(maxValue);
            System.out.println((maxIndex[0]+1) + " " + (maxIndex[1]+1));

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}