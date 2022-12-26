package com.zjy.interface_;

//演示多态传递现象
public class InterfacePolyPass {

    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例

        IA ia = new Teacher();
        //如果IG 继承了 IH接口，而Teacher类实现了IG接口
        //那么，实际上就相当于Teacher类也实现了IH接口

        IB ib = new Teacher();

    }
}
interface IA{}
interface IB extends IA{}//如果不继承，那么无法实例化ib
class Teacher implements IB{

}
