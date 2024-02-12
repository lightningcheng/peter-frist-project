package ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //需求：使用三元运算符，获取两个数的较大值
        //1.
        int number1 = 10;
        int number2 = 20;

        //2.
        //格式：关系表达式？表达式1： 表达式2；
        //整个撒元运算符的结果必须要被使用
        int max=number1 > number2? number1 : number2;
        //表达式1(number1 > number2)的值为假，所以运算结果为表达式2在本例中也就是number2
        int min=number1 < number2? number1 : number2;
        //表达式1真，则结果为表达式1
        System.out.println(max);
        System.out.println(min);

        System.out.println(number1 > number2? number1 : number2);



    }
}
