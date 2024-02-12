package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();

        switch (choose){
            case "jipiao":
                System.out.println("you choose the jipiao");
                break;
            default:
                System.out.println("none");
        }
    }
}
