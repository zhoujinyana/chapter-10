package com.zjy.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.job();
        BB bb = new BB();
        bb.job();


    }
}
class AA extends Template{//重写了父类的方法
    public void job(){
       long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num += i;

        }

    }
}
class BB extends Template {
    public void job(){

        long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num *= i;

        }

    }

}