package com.zjy.interface_;

public class interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);



    }
    public static void t(DBinterface dBinterface){

        dBinterface.connect();
        dBinterface.close();

    }
}
