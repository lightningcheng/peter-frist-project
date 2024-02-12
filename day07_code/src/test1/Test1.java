package test1;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季,头等舱和经济舱收费、输入机票票价、月份和头等舱或经济舱。
        按照如下规则计算机机票价格：旺季（5~10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，
        经济舱6.5折。
         */
        //分析：
        Scanner sc = new Scanner(System.in);

        System.out.println("please type ticket price");
        int ticketPrice = sc.nextInt();
        System.out.println("please type month");
        int month = sc.nextInt();
        System.out.println("pleas type your seat,first =1,second =2");
        int seat = sc.nextInt();
        System.out.println(getticket(ticketPrice, month, seat));

    }

    public static double getticket(int ticket, int month, int seat) {
        double zk = 0;
        if (5 <= month && month <= 10) {
            if (seat == 1) {
                 zk = 9;
            } else {
                 zk = 8.5;
            }
        }
        if (month <= 4 && month > 0 || month >= 11 && month <= 12) {
            if (seat==1){
                 zk = 7;
            }else{
                //discount
                zk = 6.5;
            }
        }
        double sum = ticket*zk/10;//注意打折的算法
       return  sum ;

    }
}

//ctrl + alt + M自动抽取方法