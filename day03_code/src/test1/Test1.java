package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中的各位，十位，百位
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //获取个位，十位，百位
        int ge = number & 10;
        int shi = number/10%10;
        int bai = number /100 % 10;
        System.out.println("个位是: "+ge);
        System.out.println(shi);
        System.out.println(bai);


    }
}
