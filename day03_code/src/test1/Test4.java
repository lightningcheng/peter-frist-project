package test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的质量：");
        int weight1 = sc.nextInt();
        System.out.println("please type ohter");
        int weight2 = sc.nextInt();

        String reuslt = weight1 == weight2 ? "same":"have different";
        System.out.println(reuslt);


    }
}