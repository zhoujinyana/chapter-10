package com.zjy.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.n1);//创建对象访问
        System.out.println(B.n2);//类名直接访问static变量
        System.out.println(C.address);//不用实例化

    }
}
class B{
    public int n1 = 100;
    public static int n2 = 100;
}
class C{
    public static String address = "北京";
}