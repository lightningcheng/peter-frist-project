package test1;

public class Test15 {
    public static void main(String[] args) {
        int number = 100;
        int all = 0;
        for(int i =0; i<=100;i=i+2){
            System.out.println(i);
            System.out.println(all = i + all);
        }
    }
}
