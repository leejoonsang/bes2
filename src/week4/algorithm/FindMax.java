package week4.algorithm;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[9];
            int max = 0;

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            System.out.println(max);

            for(int j=0; j<9; j++){
                if(arr[j] == max){
                    System.out.println(j+1);
                    break;
                }
            }

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
