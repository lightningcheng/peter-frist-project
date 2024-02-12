package test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kh = sc.nextInt();
        if(kh <= 600){
            System.out.println("you are pay successfully");
        }else{
            System.out.println("you can't pay it");
        }
    }
}
