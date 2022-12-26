package com.zjy.innerclass_;

import com.sun.deploy.panel.JreFindDialog;

public class Exercise01 {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("名画");
            }
        });

    }

    public static void f1(AA aa){
        aa.show();


    }
}
interface AA{
    void show();
}
