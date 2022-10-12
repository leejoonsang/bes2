package week4.algorithm;

public class MaxMin {

    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int getMin(int[] arr){
        int minValue = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
//        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        MaxMin max02 = new MaxMin();
        int result = max02.getMax(arr);
        if (result == 85) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result:" + result);
        }
    }
}
