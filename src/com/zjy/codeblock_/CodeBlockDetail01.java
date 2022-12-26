package com.zjy.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        new BBB();

    }
}
class AAA{
    {
        System.out.println("aaa的普通代码块");
    }
     public AAA(){
         System.out.println("aaa被调用");

     }
}
class BBB extends AAA{
    {
        System.out.println("bbb的普通代码块");
    }
    public BBB(){
        System.out.println("bbb被调用");
    }

}