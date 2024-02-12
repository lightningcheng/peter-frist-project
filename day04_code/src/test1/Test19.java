package test1;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        /*给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        将两数相除，要求不适用乘法，除法和%运算符。
        得到商和余数。
         */
        System.out.println("请输入被除数：");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.println("请输入除数：");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        int count = 0;
        while (number1>=number2)
        {
            number1 = number1-number2;
            count++;
        }

        System.out.println("商为："+count);
        System.out.println("余数为："+number1);
    }
}
