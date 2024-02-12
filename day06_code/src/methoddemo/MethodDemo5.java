package methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //掌握带返回值方法的定义和调用

        //直接调用
        getSum(2,3,4);

        //赋值调用
        int pri = getSum(3,4,5);
        System.out.println(pri);

        //输出调用
        System.out.println(getSum(6,7,8));

    }
    public static int getSum(int num1, int num2, int num3){
        int sum = num1+ num2+num3;
        return sum;//返回值给调用处
    }
}
