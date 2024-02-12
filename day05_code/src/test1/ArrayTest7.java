package test1;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*需求：定义一个数组，将数组中0索引和最大索引的值进行交换         */
        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.将数组中0索引和最大索引引出的值进行交换
        //也是可以利用第三放变量进行交换（与交换变量的值相同的思路
        int temp = arr[0];//临时变量用来当作中转站
        arr[0] = arr[4];
        arr[4] = temp;

        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
