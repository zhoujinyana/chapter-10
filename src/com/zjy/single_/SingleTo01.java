package com.zjy.single_;

public class SingleTo01 {
    //饿汉式，用不用我都提前创建好对象
    public static void main(String[] args) {
        System.out.println(girlfriend.getInstance());
    }
}
class girlfriend{
    private String name;
    //如何保证只能创建一个girlfriend对象
    private static girlfriend gf = new girlfriend("小红");

   private girlfriend(String name) {
        this.name = name;
    }
    public static girlfriend getInstance(){
       return gf;
    }

    @Override
    public String toString() {
        return "girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}