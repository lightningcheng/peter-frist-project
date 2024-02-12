package artithmeticoperator;

public class Ap6 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x:"+x);
        int y = x++;
        System.out.println("x:"+x);//这里x为11因为自增了一次.
        int z = ++x;
        System.out.println("x:"+x);//这里x自增了两次所以为12
        System.out.println("y:"+y);
        System.out.println("z:" + z);
    }
}
