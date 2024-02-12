package logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {


        //1.&
        //true true = true
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        //2. |
        //false false = false
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//false
        System.out.println(false | true);//false


    }
}