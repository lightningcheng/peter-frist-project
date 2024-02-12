package test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {


    //1.创建一个数组用来存3个汽车对象
    Car[] arr = new Car[3];

    //2.创建汽车对象，数据来自于键盘录入
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i <arr.length; i++){
        //创建汽车对象
        Car c = new Car();
        //这个创建对象如果在for循环外面就只是创建了一个对象后面的循环会不断覆盖这个对象从而只是打印最后一个值

        //录入品牌
        System.out.println("please type car's brand");
        String brand = sc.next();
        c.setBrand(brand);
        //录入价格
        System.out.println("please type car's price");
        int price = sc.nextInt();
        c.setPrice(price);
        //录入颜色
        System.out.println("please type car's color");
        String color = sc.next();
        c.setColor(color);

        //把汽车对象添加到数组中
        arr[i] = c;

    }

    //3.遍历数组
        for(int i = 0; i < arr.length;i++){
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }

    }
}
