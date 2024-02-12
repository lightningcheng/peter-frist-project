package test1;

public class Test3 {
    public static void main(String[] args) {
        //定义方法,比较两个长方形的面积
        double rectangle1,rectangle2 = 0;
        rectangle1 = getAreaTwo(3.2,3.4);
        rectangle2 = getAreaTwo(5.4,5.3);
        if(rectangle1>rectangle2){
            System.out.println("rectangle1 is biggest!");
        }else{
            System.out.println("rectangle2 is biggest!");
        }
    }
    public static double getAreaTwo(double num1, double num2){        //注意这时候不是void而是double
        double area = num1*num2;
        return area;
    }
}
