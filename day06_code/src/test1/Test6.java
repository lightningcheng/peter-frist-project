package test1;
public class Test6 {
    public static void main(String[] args) {
        //需求;设计一个方法求数组的最大值,并将最大值返回
        //先定义一个数组
        int[] arr = {23,24,25,26};
        int max =compare(arr);
        System.out.println(max);
    }
    public static int compare(int[]arr){
            int max = arr[0];
            for (int i =1; i<arr.length;i++) {    //z=注意遍历数组的方式
                max = arr[i];
            }
            return max;
        }
        }

