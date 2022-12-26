package com.zjy.abstract_;

abstract public class Template {//抽象类--模板设计模式
    public abstract void job();
    public void calTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
