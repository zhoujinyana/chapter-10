package com.zjy.innerclass_;

public class AnonymouslnnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();

    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){
        Person p = new Person(){
            public void hi(){
                System.out.println("匿名内部类重写了hi" + n1);
            }

        };
        p.hi();

        new Person(){
            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("adma");
    }
}
class Person{
    public void hi(){
        System.out.println("hi");
    }
    public void ok(String str){
        System.out.println("name=" + str);
    }
}
