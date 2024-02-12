package arraydemo;

/*
数组动态初始化
动态初始化:初始化时指定数组长度,有系统为数组分配初始值.
格式:数据类型[] 数组名 = new 数据类型[数组长度];
范例:int[] arr new int[3];
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        /*定义一个数组,用来存班级中50个学生的姓名
         姓名未知,等学生报道之后,再进行添加.   */

        //格式:
        //数据类型[] 数组名 = new 数据类型[数组长度];
        //再创建的时候,由我们自己指定数组的长度,由虚拟级给出默认值

        String[] arr = new String[50];
        //添加学生
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        //获取
        System.out.println(arr[0]);//zhangsan
        System.out.println(arr[1]);//lisi
        System.out.println(arr[2]);//打印出来的时默认初始化值

        //数组默认初始化值的规律
        //整数类型:默认初始化值0
        //小数类型:默认初始化值0.0
        //字符类型:默认初始化值'/u0000' 空格
        //布尔类型:默认初始化值 false
        //引用数据类型: 默认初始化值 null
        int[] arr2 = new int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }

}
/*
动态初始化和静态初始化的区别

动态初始化:手动指定数组长度,由系统给出默认初始值.
  只明确元素个数,不明确具体数值,推荐使用动态初始化
  举例:使用数组容器来存储键盘录入的五个整数.

静态初始化:手动指定数组元素,系统会根据元素个数,计算出数组的长度.
   需求中已经明确了要操作的具体数据,直接静态初始化即可.
   举例:将全班的学生成绩存入数组中 11,22,33
   int[] arr = {11,22,33};

 */


