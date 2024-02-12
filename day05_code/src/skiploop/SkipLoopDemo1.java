package skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==3){
                //结束本次循环，继续下次循环（第三个不会执行，开始第四个。
                continue;
            }
            System.out.println("eat "+i+" baozi");
        }
    }
}
