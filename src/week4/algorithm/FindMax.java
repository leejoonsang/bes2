package week4.algorithm;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[9];
            int maxValue = 0;
            int maxIndex = 0;

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > maxValue){
                    maxValue = arr[i];
                    maxIndex = i;
                }
            }

            System.out.println(maxValue);
            System.out.println(maxIndex+1);

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
