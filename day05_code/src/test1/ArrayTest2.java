package test1;

public class ArrayTest2 {
    public static void main(String[] args) {



    //定义一个数组,存储1,2,3,4,5,6,7,8,9,10  遍历数组得到每一个元素,统计数组里面一共有多少个能被三整除的数字
    int[] arr ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3==0){
                System.out.println(i+1);
            }
        }
        //错误原因:理解错误(没认真看清题目要求,是要统计有多少个能被整除的数字

        //答案:

        //分析:
        //1.先定义数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        //定义一个变量,用来统计次数
        int count = 0;
        //遍历数组得到每一元素
        for (int i = 0; i < arr1.length; i++) {
            //i 表示数组里面的每一个索引
            //arr[i] 表示数组里面的每一个元素
            //判断当前的元素是否为3的倍数,如果是那么统计变量就需要自增一次
            if(arr1[i] % 3 == 0){
                // System.out.println(arr[i]);
                count++;
            }
        }
        //当循环结束后,就表示数组里面索引的数字都判断完毕了,直接打印count即可
        System.out.println("数组中能被3整除的数字有"+count+"个");
}
}
