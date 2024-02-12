package test1;

public class Test6 {
    public static void main(String[] args) {
        //需求:先得到每一位数字,然后每位数字都加上5,再对10求余,最后将所有数字反转,得到一串新数字.
        //分析:
        //1.把整数里面的每一位放到数组当中
        int[] arr = {8,3,4,6};
        //2.加密
        //每位数都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //每位数对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有数字反转
        for (int i = 0,j = arr.length-1 ;i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[i];
            arr[j] = temp;
        }
        //8 3 4 6 -->8346
        //将数组中的每一个数字进行拼接,变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);




    }






}
