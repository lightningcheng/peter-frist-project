package switchdemo;
import java.util.Scanner;

/*
case穿透，就是语句体中没有写break导致的。
在
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foods = sc.next();

        switch(foods){

            case"lan":
                System.out.println("chilan");
                break;
            case "wuhan":
                System.out.println("chiwuhan");
                break;
            //位置：default不一定是写在最下面的，但习惯写在最下面
            //省略：default可以省略，但不建议省略。
            default:
                System.out.println("foods的值不是lan也不是wuhan");
        }
    }
}
