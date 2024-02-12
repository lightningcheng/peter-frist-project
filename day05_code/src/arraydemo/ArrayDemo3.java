package arraydemo;
/*
数组遍历:将数组中所有的内容取出,取出来可以(打印,求和,判断..
注意:遍历指的是取出数据的过程,不要局限理解为,遍历就是打印.
 */
public class ArrayDemo3 {
    public static void main(String[] args) {


        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.获取数组里面所有的元素
        //格式:数组名[索引]
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //利用循环改进代码
        //开始条件:0
        //结束条件:数组的长度 - 1(最大索引)
        for (int i = 0; i < 5; i++) {
            //i:0 1 2 3 4
            System.out.println(arr[i]);
        }
        //在java当中,关于数组的一个长度属性,length
        //调用方式:数组名:length
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            //i:0 1 2 3 4
            System.out.println(arr[i]);
        }
        //扩展:
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}