package com.zjy.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();


    }
}
class A{
    //静态属性的初始化
    private static int n1 = getN1();
    static{
        System.out.println("A的静态代码块");
    }
    public static int getN1(){
        System.out.println("getn1被调用");
        return 100;
    }
}
