package test1;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean flag = findnumber(arr,189);
        System.out.println(flag);
    }
    public static boolean findnumber(int[] arr,int number1){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number1){
//                System.out.println("true");
                   return true;
            }
//            else {
//                System.out.println("false");//如果这样写会一直打印false
            }
            return false;
        }

    }

