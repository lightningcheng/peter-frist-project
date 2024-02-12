package test1;

public class ArrayTest8 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1，2，3，4，5.交换首位索引对应的元素
        交换前：1，2，3，4，5
        交换后：5，2，3，4，1
         */
        //1.定义数组存储数据
        int[] arr ={1,2,3,4,5};
        //2.利用循环去交换数据
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {   //这时候i为第一个元素，j为最后一个元素
            //交换变量i和变量j指向的元素
            int temp =arr[i];    //temp为临时变量来存储数组中第一个元素的值
            arr[i] = arr[j];     //将最后一个元素的值与第一个元素的值进行交换
            arr[j] = temp;      //将存储在临时变量temp的第一个元素的值赋予最后一个元素
        }
        //当循环结束之后，那么数组的数据就实现了头尾交换
        for (int  i= 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");//遍历这个数组来打印出来其元素
        }
    }
}
