package com.zjy.static_;

public class VisitStatic {
    public static void main(String[] args) {

        //类变量是随着类的加载而创建的，没有创建对象实例也可以访问
        System.out.println(A.name);
    }
}
class A{
    public static String name = "周晋燕";

}