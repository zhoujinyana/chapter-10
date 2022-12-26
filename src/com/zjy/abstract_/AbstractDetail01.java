package com.zjy.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能实例化
        //new A();
    }
}
abstract class A{
    //抽象类可以没有抽象方法
    public void hi(){
        System.out.println("hi");
    }

}