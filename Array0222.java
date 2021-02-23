package Array;


import java.util.Arrays;
import java.util.Random;


public class Array0222 {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int[] arr1 = new int[5];
//        for(int i = 0; i < 5; i++){
//            arr1[i] = rand.nextInt(100);
//        }
//        for(int i = 0;  i < 5; i++){
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        System.out.println(arr1.length);
//        for(int x : arr1){
//            System.out.println(x);
//        }
//        int[] arr = {1, 2, 3, 4};
//        printArray(MulArray(arr));
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for(int x : arr){
//            System.out.println(x);
//        }
//    }
//    public static int[] MulArray(int[] arr){
////        for(int i = 0; i < 4; i++){
////           int temp = arr[i];
////            arr[i] = temp * 2;
////        }
//        int[] ret = new int[arr.length];
//        for(int i = 0; i < ret.length; i++){
//            ret[i] = arr[i] * 2 ;
//         }
//        return ret;
//        int[] arr = {1, 2, 3, 4};
////        System.out.println(arrayToString(arr));
//        System.out.println(Arrays.toString(arr));
//    }
//    public static String arrayToString(int[] arr){
//        String ret = "[";
//        for(int i = 0; i < arr.length; i++){
//            ret += arr[i];
//            if(i != arr.length - 1){
//                ret += ",";
//            }
//        }
//        ret += "]";
//        return ret;
        //数组拷贝
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = Arrays.copyOf(arr1, 7);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(search(arr1, 3));
//    }
//
//    private static int search(int[] arr, int num) {
//        for (int i = 0; i< arr.length; i++){
//            if(arr[i] == num){
//                return i;
//            }
//        }
//        return -1;
//    }
        int[] arr = {9, 8, 5, 1, 3, 2};
//        bubbleSort(arr);
//        Arrays.sort(arr);
        resveArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void resveArray(int[] arr) {
        int bound = 0;
        int end = arr.length - 1;
        while(bound < end){
            while(arr[bound] % 2 == 0 ){
                bound++;
            }
            while(arr[end] % 2 != 0){
                end--;
            }
            if(bound < end){
                int temp = arr[bound];
                arr[bound] = arr[end];
                arr[end] = temp;
            }
        }
    }


//    public static void bubbleSort(int[] arr) {
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length - i - 1; j++){
//                if(arr[j] < arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
}
