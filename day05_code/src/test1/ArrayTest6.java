package test1;

public class ArrayTest6 {
    public static void main(String[] args) {
        //交换变量的值
        int a =10;
        int b =20;

        int temp =0;
        temp = a;//temp=10
        a=b;//a=20
        b=temp; //b=10
        System.out.println("ab的值分别是："+a+"，"+b);
    }
}
