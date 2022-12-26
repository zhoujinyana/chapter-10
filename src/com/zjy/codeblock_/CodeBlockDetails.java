package com.zjy.codeblock_;

public class CodeBlockDetails {
    public static void main(String[] args) {
        //创建对象实例时，类被加载
        //AA aa = new AA();
        //创建子类对象实例，父类也会被加载,父类先被加载
        //AA aa1 = new AA();
        //使用类的静态成员,属性，方法
        System.out.println(Cat.n1);




    }
}
class Cat{
    public static int n1 = 1000;
    static{
        System.out.println("Cat的静态代码块被执行");
    }
}
class BB{
    static{
        System.out.println("BB的静态代码块被执行");
    }
}
class AA extends BB{
    static{
        System.out.println("AA的静态代码块被执行");
    }
}