package week4.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort03 {

    public int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발
        int[] arr = new int[]{5, 8, 6, 2, 4};

        InsertionSort03 insertionSort02 = new InsertionSort03();
        int result[] = insertionSort02.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
