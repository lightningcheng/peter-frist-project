package test1;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int number2 = sc1.nextInt();

        int count = 0;

        for (int i = number1; i < number2 ; i++) {
            System.out.println("this number" +i);
            if(i%3==0&&i%5==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
