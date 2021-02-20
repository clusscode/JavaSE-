package zkda;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //取随机数作为要被猜的数据
        Random r = new Random();
        int i = r.nextInt(100);
//        System.out.println(i);
        //猜数字的过程
        // 使用Scanner输入玩家猜的数字
        Scanner s = new Scanner(System.in);
        int left = 0;
        int right = 100;
        while(true){
            System.out.print("请输入你心中的数字:>");
            int guess = s.nextInt();
            //判断玩家猜的对不对
            if(guess == i){
                System.out.println("恭喜你，猜对了！");
                break;
            } else if(guess > i){
                System.out.println("猜大了！数字在" + left +"和" + guess + "之间");

            } else if(guess < i){
                System.out.println("猜小了！数字在" + guess +"和" + right + "之间");
            }
            //left   guess1   i      guess2     right
            //当所猜的数guees1要小于i的时候，这个时候是猜小了，那么我们就是left变成guess1，以此来缩小范围
            //当所猜的数guees1要大于i的时候，我们就是使right变成guess2来缩小范围，，
            //这样不会因为改变某个数而造成数据交错
            //如果两个都改变的话，那么连续两次猜大或猜小的时候会导致范围都到了所猜数字i的大于边或者小于边
            //
            if(guess < i){
                left = guess;
            } else{
                right = guess;
            }
        }
//        while(true){
//            System.out.print("请输入你心中的数字:>");
//            int guess = s.nextInt();
//            //判断玩家猜的对不对
//            if(guess == i){
//                System.out.println("恭喜你，猜对了！");
//                break;
//            } else if(guess > i){
//                System.out.println("猜大了！数字在" + left +"和" + guess + "之间");
//
//            } else if(guess < i){
//                System.out.println("猜小了！数字在" + guess +"和" + right + "之间");
//            }
//                left = guess;
//                right = guess;
//            }
//        }
    }
}
