package Java41_0310;

import java.util.Scanner;

public class GainMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(MaxThree(a, b, c));
    }
    public static int MaxThree(int x, int y, int z){
        int max = MaxTwo(x, y);
        if(max > z){
            return max;
        }
        return z;
    }
    public static int MaxTwo(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }
}
