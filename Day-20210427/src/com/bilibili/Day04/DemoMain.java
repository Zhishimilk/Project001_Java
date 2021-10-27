package com.bilibili.Day04;

public class DemoMain {

    public static void main(String[] args) {

        Impl impl = new Impl();

        impl.method1();
        impl.method2();
        impl.ftn();

        System.out.println("-------------------------------");

        InterfaceAbstract.method4();
        InterfaceAbstract.method5();
        System.out.println(InterfaceAbstract.NAME);
    }
}
