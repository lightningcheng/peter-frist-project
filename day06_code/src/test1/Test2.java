package test1;

public class Test2 {
    public static void main(String[] args) {
        //定义一个方法求圆的面积
        //根据需求选择无参或带参数的方法
        getArea(1);
    }

    public static void getArea(double radius) {
        double area = Math.PI * radius *radius;
        System.out.println(area);
    }
}
