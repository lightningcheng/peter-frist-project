package test1;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*定义一个数组,存储1,2,3,4,5,6,7,8,9,10 遍历数组得到每一个元素
        要求:
        如果是奇数,则将当前数字扩大两倍
        如果是偶数,则将当前数字变成二分之一
         */
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] / 2 == 0){
//                arr[i] = arr[i] % 2;
//                System.out.println(arr[i]);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] / 2 != 0){
//                arr[i] = arr[i] * 2;
//                System.out.println(arr[i]);
//            }
//
//        }

        //错误原因:
        //运算符使用错误

        //答案:

        //分析:
        //1.定义一个数组
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            // i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            //3.对每一个元素进行判断
            if(arr[i] % 2 ==0){
                // 偶数 变成二分之一
                arr[i] = arr[i] / 2;
            }else{
                //奇数 扩大两倍
                arr[i] = arr[i] * 2;
            }
        }
    //遍历数组
    //一个循环尽量只做一件事
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }

}
