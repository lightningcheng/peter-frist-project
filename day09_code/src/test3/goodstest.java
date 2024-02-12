package test3;

public class goodstest {
    public static void main(String[] args) {
        //1.创建一个数组
        goods [] arr = new goods[3];

        //2.创建三个商品对象
        goods g1 = new goods("001","huaweip40",5999,100);
        goods g2 = new goods("002","mi12x",2799,999);
        goods g3 = new goods("003","samung10",1999,100);
        //goods g4 = new goods();  选中小括号按住ctrl+p可以显示有参构造的顺序

        //4.遍历
        for (int  i = 0; i< arr.length; i++){
            //i 索引 arr[i] 元素
            goods goods = arr[i];
            System.out.println(goods.getId()+","+ goods.getName()+","+goods.getPrice()+","+goods.getCount());

            //第二套体系：
            //nextiLine();接收字符串






        }


    }
}
