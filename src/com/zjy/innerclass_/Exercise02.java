package com.zjy.innerclass_;

public class Exercise02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        phone.alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

    }
}
interface Bell{
    void ring();
}
class Phone{
    public void alarm(Bell bell){
        bell.ring();
    }
}
