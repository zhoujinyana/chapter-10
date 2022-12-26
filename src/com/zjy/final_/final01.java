package com.zjy.final_;

public class final01 {
    public static void main(String[] args) {
        System.out.println(BBB.num);//使用类的静态属性时，静态代码块被先调用（类加载）。

    }
}
class BBB{
    //final和static往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理

    public static final int num = 1000;//静态属性
    static{
        System.out.println("静态代码块被执行");
    }
}