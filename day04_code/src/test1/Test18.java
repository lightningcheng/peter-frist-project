package test1;

public class Test18 {
    public static void main(String[] args) {
              int x = 12345;
              int temp = x;
              int num = 0;
              while (x!=0){
                  int ge = x%10;
                  x = x/10;
                  num = num*10 + ge;



              }
           System.out.println(num);
           System.out.println(x);
           System.out.println(num == temp);
    }
}
        /*
        需求：给你一个整数x
        如果是回文整数返回true否则返回false

         */
        /*int x = 1234;
        int num =0;
        while(){
            int ge = x % 10;
            int shi = x /10;

        }


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number<=100){
            System.out.println(false);
        }


    }
}
*/