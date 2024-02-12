package test4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        //如果在这里来输入123+回车  只会读取到123 回车会留在内存中被nextline（）读取从而导致不能使用nextline
        System.out.println(num);//  打印123
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);

    }
}
