package zkda;

import com.sun.javaws.IconUtil;

import java.util.Scanner;
public class Class0220 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        System.out.println(a + " " +b);
//        int sum = 0;
//        while(s.hasNext()){
//            int i = s.nextInt();
//            sum += i;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        int num = 5;
//        for(int i = 1; i <= num; i++ ){
//           sum += factor(i);
//        }
//        System.out.println(sum);
//    }
//
//    //此处形参的i 和外面实参的i之间没有关联关系
//    //形参的 i 的作用域只是当前的factor方法内部
//    //形参的名字可以随便起
//    //方法要写在类里面，以public static开头，返回类型自定
//    public static int factor(int i) {
//        int ret = 1;
//        for(int j = 1; j <= i; j++){
//            ret *= j;
//        }
//        return ret;
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int ret =min(a, b);
//        System.out.println(ret);
//    }
//    public static int min(int x, int y){
//        if(x > y){
//            return y;
//        }else{
//            return x;
//        }
//    }
//        printNumber(1, 100);
//    }
//    public static void printNumber(int beign, int end){
//        for(int i = beign; i <= end; i++){
//            if(isPrime(i)){
//                System.out.print(i + " ");
//            }
//        }
//    }
//    public static boolean isPrime(int num){
//        for(int j = 2; j < num; j++){
//            if(num % j == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//        is_runyear(1000, 2000);
//    }
//    public static void is_runyear(int year1, int year2){
//        for(int i = year1; i <= year2; i++){
//            if(runyear(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean runyear(int year){
//        if((year%100 != 0 && year%4 ==0) || year%400 == 0){
//            return true;
//        }
//        else
//            return false;
//
//    }
//        printMul(9);
//    }
//    public static void printMul(int num){
//        for(int i = 1; i <= num; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + "*" + i + "=" + i*j + "\t");
//            }
//            System.out.println();
//        }
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入:>");
        String str = scanner.next();
        System.out.println(str);
        System.out.print(str);
        System.out.printf("printf：%s ", str);
        System.out.format("format：%s ", str);
    }
}