package test1;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //需求:在1~100中随机取值
        //创建对象
        Random r = new Random();
        //生成随机数
        int number = r.nextInt(9)+7;//7~15

        System.out.println(number);

        //如何生成任意数之间的随机数7~15
        //1.让这个范围头尾都减去一个值,让这个范围从0开始 -7 0~8
        //2.尾巴+1  8+1 = 9
        //3.最终的结果,再加上第一步减去的值
        /*
        Random r = new Random();
        int number = r.nextInt(9) + 7;//7~15
                //0~8 + 7
         System.out.println(number);
         */




    }
}
