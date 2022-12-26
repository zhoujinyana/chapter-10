package com.zjy.innerclass_;
/*
演示匿名内部类的使用
 */

public class AnonymouslnnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}
class Outer04{
    private int n1 = 100;
    public void method() {
  //基于接口的匿名内部类
        A tiger = new A() {//匿名内部类隐含了implement实现的方法
            public void cry() {
                System.out.println("老虎叫唤。。。");
            }

        };
        tiger.cry();
        //基于类的匿名内部类
       Father father= new Father("jack"){//匿名内部类隐含了extends继承关系
            public void test(){
                System.out.println("重写了父类test");
            }
        };
       father.test();

       //基于抽象类的匿名内部类
        Animal animal = new Animal(){

            @Override
            void eat() {//匿名抽象类必须实现方法
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();

    }
}
interface A{
    public void cry();
}
class Father{
    public Father(String name){

    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}