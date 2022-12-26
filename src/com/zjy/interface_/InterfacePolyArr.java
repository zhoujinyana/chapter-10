package com.zjy.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new phone_();
        usbs[1] = new camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof phone_){
                ((phone_) usbs[i]).call();
            }

        }

    }
}
interface Usb{
    public void work();

}
class phone_ implements Usb{

    @Override
    public void work() {
        System.out.println("手机正在工作");
    }
    public void call(){
        System.out.println("手机正在打电话");
    }
}
class camera_ implements Usb{

    @Override
    public void work() {
        System.out.println("相机正在工作");
    }
}