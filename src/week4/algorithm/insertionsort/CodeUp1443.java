package week4.algorithm.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1443 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=1; i<arr.length; i++){
                for(int j=i; j>0; j--){
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }

            for(int element : arr) {
                System.out.println(element);
            }

        }catch (Exception e){
            System.out.println("다시 입력하세요.");
        }
    }
}
