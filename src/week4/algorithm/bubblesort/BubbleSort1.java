package week4.algorithm.bubblesort;

import java.util.Arrays;
import java.util.Objects;

public class BubbleSort1 {

    public int[] bubbleSorter(int[] arr){
        int temp;
        for(int i=0; i<(arr.length-1); i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요.
        BubbleSort1 bubbleSort1 = new BubbleSort1();
        int[] result = bubbleSort1.bubbleSorter(arr);
        System.out.println(Arrays.toString(result));
    }

}
