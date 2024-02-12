package test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //评委打分打分范围式0到100之间的整数
        //要求去掉最高分和最低分后的四个评委的平均分.
        //分析:
        //1.定义一个数组,用来存储6名评委的打分
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2.求出数组中的最大值
       int max = getMax(scoreArr);
        //3.最小值
        int min = getMin(scoreArr);
        //4.求出数组中6个分数的总
        int sum = getSum(scoreArr);
        //5(总和 - 最大值- 最小值)/4
        //System.out.println( "平均分为;"+  (sum-max-min)/4);  //也可定义一个值为average,把式子中的值赋予average.
        //如果像上一行那样去求平均数也是可以的但是由于使用的是除于4,而四这个数在数组长度发生改变后需要单独更改比较死,建议使用scoreArr.length来进行运算比较灵活
        System.out.println("平均分为:"+(sum -max - min)/(scoreArr.length-2));//注意这里的数组长度要减去二,因为去除了数组中的两个值.
        //步骤较多使用方法,来解决
        //1.干什么?   定义个数组来存储评委的打分
        //2.需要什么?什么都不需要
        //3.干完了这件事,是否需要返回? 必须返回

        }//这个是方法与程序主体的分割
    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];//六名评委,数组长度为六,分数(0-100)
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {   //用于检测分数输入无效
                scores[i] = score;
                i++;  //只有输入合法成绩时i才会增加
            }else{
                System.out.println("你输入的成绩无效,当前i值为:"+i);//如果不合法,i不会增加,一直在数组的0项
            }
        }
        return  scores;
    }
    //创建求数组中最大值的方法
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if      (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    //创建求数组中最小值的方法
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
               min = scoreArr[i];
            }
        }
        return min;
    }

    //创建求数组之和的方法
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = scoreArr[i] + sum;
        }
        return sum;
    }
}
