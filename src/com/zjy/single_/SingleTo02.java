package com.zjy.single_;

public class SingleTo02 {
    //懒汉式单例模式
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
class Cat{
    private String name;
    private static Cat cat;

    public Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}