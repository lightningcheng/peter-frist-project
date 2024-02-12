package test1;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*定义一个数组,存储1,2,3,4,5
        遍历数组得到每一个元素,求数组里面所有的数据之和
         */
        //分析:
        //1.一个数组,并添加数据1,2,3,4,5

        int[] arr = {1,2,3,4,5};//定义一个类型为int的数组,名为arr,数组中的数据有1,2,3,4,5

        //求和变量
        int sum = 0;
        //2.遍历数组得到每一个数据,累加求和
        for (int i = 0; i < arr.length; i++) {
            //i依次表示数组里面的每一个索引
            //arr[i]依次表示数组里面的每一个元素
            sum = sum + arr[i];
        }
        //当循环结束之后,sum的值就是累加之后的结果
        System.out.println(sum);
    }
}
