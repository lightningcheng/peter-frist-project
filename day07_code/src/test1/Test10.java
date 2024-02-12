package test1;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        /*
        需求: 分别有{2, 588, 888,1000,10000}五个奖金,打印出
        每个奖项,奖项的出现顺序要随机且重复

         */
        int [] arr = { 2,588,888,1000,10000};
        Random r = new  Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着i跟随机索引randomIndex上的值进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;

        }
        //2.遍历奖池,从0索引开始获取每一个奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

























