package com.zjy.interface_;

public class interface02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);//A.n1也可以访问
        System.out.println(interface01.n1);


    }
}
interface interface01{
    public int n1 = 10;
    //在接口中，抽象方法可以省略abstract关键字
    public void hi();
    public default void ok(){
        System.out.println("ok");

    }
    public static void cry(){
        System.out.println("cry");
    }
}
class A implements interface01{


    @Override
    public void hi() {
        System.out.println("hi()...");
    }
}