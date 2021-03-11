package Java41_2_9;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Methos {
    public static void main(String[] args) {
        int[] arr = new int[10];
        InputArray(arr);
        Exchange(arr);
        Print(arr);
    }

    private static void Print(@NotNull int[] arr) {
        for(int x : arr){
            System.out.print(x + "");
        }
    }

    public static int[] InputArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for(int i= 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int[] Exchange(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left < right){
                if(arr[left] % 2 == 0){
                    break;
                }
                left++;
            }
            while(left < right){
                if(arr[right] % 2 != 0){
                    break;
                }
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}