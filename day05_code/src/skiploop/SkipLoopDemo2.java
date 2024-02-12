package skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //结束整个循环
        for (int i = 1; i <=5 ; i++) {
            if(i==3){
                //结束整个循环
                break;
            }
            System.out.println("eat" + i+" baozi");
        }
    }
}
