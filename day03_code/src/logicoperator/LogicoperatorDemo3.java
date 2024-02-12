package logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {


        //1. &&

        System.out.println(true && true);
        System.out.println(false && false);
        System.out.print(false && true);    //这里也可以看到println 和 print 的区别
        System.out.print(true && false);

        //2. ||
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        //3.当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 & ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

    }
}