package com.zjy.innerclass_;

//演示局部内部类
public class LocallnnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();


    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("outer02 m2()");
    }
    public void m1(){
         final class Inner01{
             //不能用修饰符，但是可以用final
             private int n1 = 800;
            public void f1(){
                System.out.println(n1);//内部类可以直接访问私有属性(就近原则）
                System.out.println(Outer02.this.n1);//访问外部类成员
                m2();
            }
        }
        Inner01 inner01 = new Inner01();
         inner01.f1();

    }


}
