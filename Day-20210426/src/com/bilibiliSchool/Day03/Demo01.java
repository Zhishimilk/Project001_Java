package com.bilibiliSchool.Day03;

public class Demo01 {

    public static void main(String[] args) {

        Impl impl = new Impl();
        Impl1 impl1 = new Impl1();

        impl.methodAbs();
        impl.methodAbs1();

        System.out.println("---------------------------");
        impl1.methodAbs();
        impl1.methodAbs1();
        MyInterfaceAbstract.methodAbs2();
        
    }
}
