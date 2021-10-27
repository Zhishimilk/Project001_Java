package com.bilibiliSchool.Day03;

public interface MyInterfaceAbstract {

    public abstract void methodAbs();

    public default void methodAbs1(){

        System.out.println("接口中的默认函数");
    }

    public static void methodAbs2(){

        System.out.println("接口中的静态函数");
    }

}
