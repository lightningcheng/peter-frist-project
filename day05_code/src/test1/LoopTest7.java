package test1;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if(guessNumber>number){
                System.out.println("smaller");
            }else if(guessNumber<number){
                System.out.println("bigger");
            }else{
                System.out.println("you are right!");
                break;
            }
        }
    }
}
