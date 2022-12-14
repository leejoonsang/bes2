package week4.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort02 {

    public int[] sort(int[] arr, int i){
        // i=1일때 arr[1] ? arr[0]
        // i=2일때 arr[2] ? arr[1]
        //        arr[2] ? arr[1]
        for(int j=i; j>0; j--){
            System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
            if(arr[j] < arr[j-1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발
        int[] arr = new int[]{5, 8, 6, 2, 4};

        InsertionSort02 insertionSort02 = new InsertionSort02();
        int result[] = insertionSort02.sort(arr, 2);

        System.out.println(Arrays.toString(result));

    }
}
