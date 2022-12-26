package com.zjy.static_;

public class StaticMethod {
    public static  void main(String[] args) {
        stu tom = new stu("tom");
        tom.payFee(100);//等同于stu.payFee(100);
        stu bob = new stu("bob");
        bob.payFee(200);
        stu.show();




    }
}
class stu{
    private String name;
    private static double fee = 0;

    public stu(String name) {
        this.name = name;
    }
    //1 当方法使用了static修饰后，该方法就是静态方法
    //2 静态方法就可以访问静态属性/变量

    public static void payFee(double fee){
        stu.fee += fee;
    }
    public static void show(){
        System.out.println(stu.fee);//静态方法只能访问静态变量，所以直接访问fee也可以
    }
}