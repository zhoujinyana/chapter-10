package com.zjy.final_;

public class finalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.area(2);


    }
}
class Circle{
    private double rad;
    public final double PI = 3.14;//定义时候赋值

    public Circle(double rad) {
        this.rad = rad;
       // PI = 3.14;//构造器赋值也可以
    }
    {
        //PI = 3.14;//代码块赋值也可以（保留一种即可）
    }

    public void area(double rad){
        System.out.println(PI*rad*rad);
    }
}