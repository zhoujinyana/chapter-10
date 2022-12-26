package com.zjy.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

    }

}
class Outer10{
    private int n1 = 10;
    private static String name = "jack";
    static class Inner10{
        public void say(){
            System.out.println(name);
        }

    }
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();

    }
}