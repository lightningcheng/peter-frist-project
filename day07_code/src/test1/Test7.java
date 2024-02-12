package test1;

public class Test7 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组当中
        //反向推导

        //1.计算处数组的长度
        int number = 12345;
        //定义一个临时变量记录number 的值,为了第三步再次使用
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while(number != 0){
            //每一次循环就去掉右边的一个数字
            number = number/ 10;
            System.out.println(number);
            //去掉一位,计数器就自增一次
            count++;
        }
        System.out.println(count);

        //2.创建一个数组
        //动态初始化
        int[] arr = new int[count];
        //3.把整数上的每一位都添加到数组当中
        int index =arr.length-1;
        while(temp != 0){  //12345位temp的值
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的那位数字
            temp = temp /10;
            //把当前获取到的个位添加到数组
            arr[index] = ge;
            index--;//放到最右侧后向左移动一位
        }
        //验证结果 12345
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }

        //需要有一个数组
    }
}
