package test1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xq = sc.nextInt();
        switch (xq){
            case 1:
                System.out.println("today is workday");
                break;
               //java8不支持多个case标签
            case 6:
                System.out.println("today is weekend");
                break;
            default:
                    System.out.println("don't have this day");

        }
    }
}
//if (1 <= xq && xq <= 7) {
//            if (1 <= xq && xq <= 5) {
//                System.out.println("today is workday");
//            }
//            if (6 <= xq && xq <= 7) {
//                System.out.println("today is weekend");
//            }
//
//        }else{
//            System.out.println("you wrong");
//        }