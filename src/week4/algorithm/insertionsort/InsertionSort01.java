package week4.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr){
        int i=1;
        int temp;
        if(arr[i] < arr[i-1]){
            // swap
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertionSort01 insertionSort01 = new InsertionSort01();
        int result[] = insertionSort01.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
