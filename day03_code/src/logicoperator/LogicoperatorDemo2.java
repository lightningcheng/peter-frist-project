package logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^
        //相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        //!
       // 取反的感叹号，要么不写要么就写一个

        System.out.println(!false);
        System.out.println(!true);
    }
}
