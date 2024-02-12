package test1;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArr(arr);
        //关于打印函数的不同
        System.out.println();//不打印任何数据只换行
        System.out.println("这个打印后会自动换行");
        System.out.println("here");
        System.out.print("这个打印后不会换行");
        System.out.print("here");



    }
    //定义方法用于数组的遍历
    //1.要做甚?  遍历数组
    //2.做这个要甚么  不需要返回值
    public static void printArr ( int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}