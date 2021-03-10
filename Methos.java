package Java41_2_9;

import java.util.Scanner;

public class Methos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(factorial(N));
    }

    private static int factorial(int N) {
        int factorial = 1;
        for(int i = 1; i <= N; i++){
            factorial *= i;
        }
        return factorial;
    }
}