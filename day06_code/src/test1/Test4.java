package test1;

public class Test4 {
    public static void main(String[] args) {
        //需求：使用方法重载的思想，设计比较两个整数是否相同的方法
        //要求:兼容全整数类型(byte,short,int,long)
      compare(1.22,2.4545);
    }
    //会把相同功能的方法名起成一样的名字
    //好处1.定义放啊的时候可以不用那么多的单词了
    //好处2.调用方法的时候也不需要那么麻烦了

    public static void compare (double num1, double num2){
        if (num1 > num2) {
            System.out.println(num1 + " is biggest");
        } else {
            System.out.println(num2 + " is bigesst");
        }

    }
    public static void compare(short num1,short num2){
        if (num1 > num2) {
            System.out.println(num1 + " is biggest");
        } else {
            System.out.println(num2 + " is bigesst");
        }

    }
    public static void compare(int num1,int num2){
        if (num1 > num2) {
            System.out.println(num1 + " is biggest");
        } else {
            System.out.println(num2 + " is bigesst");
        }

    }
    public static void compare(long num1,long num2){
        if (num1 > num2) {
            System.out.println(num1 + " is biggest");
        } else {
            System.out.println(num2 + " is bigesst");
        }

    }
}