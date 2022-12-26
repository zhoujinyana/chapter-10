package com.zjy.innerclass_;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private int n1 = 10;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void hi(){
        System.out.println("方法");
    }
    {
        System.out.println("代码块");
    }
    class Inner{

    }
}