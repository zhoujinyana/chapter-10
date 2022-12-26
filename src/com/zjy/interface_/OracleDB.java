package com.zjy.interface_;

public class OracleDB implements DBinterface{

    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");

    }
}
