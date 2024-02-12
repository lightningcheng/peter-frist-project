package test1;

public class Test1 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
        getPerimeter(2,3);
    }

    public static void getPerimeter(int length, int wideth) {
         int perimeter= 2*(length + wideth); //注意perimeter这个变量是不在方法名后面声名的
        System.out.println(perimeter);
    }
}
