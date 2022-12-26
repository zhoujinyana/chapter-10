package com.zjy.static_;

public class ChildGame {
    public static void main(String[] args){
        Child child1 = new Child("jack");
        child1.join();
        child1.count++;
        Child child2 = new Child("merry");
        child2.join();
        child2.count++;
        Child child3 = new Child("bob");
        child3.join();
        child3.count++;
        System.out.println(Child.count);

    }

}
class Child{
    private String name;
    //定义一个变量count ,是一个类变量(静态变量)static静态
    // 该变量最大的特点就是会被Child 类的所有的对象实例共享

    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }
}