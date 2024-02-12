package test1;

import java.util.Random;

public class ArrayTest9 {
    public static void main(String[] args) {
        //需求:定义一个数组,存入1~5.要求打乱数组中的所有数据的顺序.
        //难点:
        //如何获取数组中的随机索引
//        int[] arr ={1,2,3,4,5};
//        //The scope of random:0 1 2 3 4
//        Random r = new Random();  //获取随机数
//        int randomindex = r.nextInt(arr.length);//随机数是整数型,随机范围为数组的长度
//        System.out.println(randomindex);


        //1.定义数组存储1~5
        int[] arr = {1,2,3,4,5};
        //2.循环遍历数组,从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomindex = r.nextInt(arr.length);
            //拿着随机索引指向的元素 跟i指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }
    //当循环结束之后,那么数组中所有的数据已经打乱顺序了
    for(int i = 0 ;i < arr.length;i++){
        System.out.println(arr[i]+" ");
       }
    }
}
