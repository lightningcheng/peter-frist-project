package test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入一个正整数，判断该数是否为质数。
        //如果一个正整数只能由1和它本省相乘得到它本身则这个数为质数。否则为合数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        for (int i = 2; i <number  ; i++) {
            if (number % i == 0) {
                System.out.println(number+"不是一个质数");
                break;
             } else{
             System.out.println(number+"是一个质数");
             }

        }


    }
}