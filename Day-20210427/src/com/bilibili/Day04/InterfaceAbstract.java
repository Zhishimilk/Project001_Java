package com.bilibili.Day04;

public interface InterfaceAbstract extends InterfaceA,InterfaceB{

    public static final String NAME = "张三";

    public default void method1(){
        System.out.println("第一个默认方法");
        method3();
    }

    public default void method2(){
        System.out.println("第二个默认方法");
        method3();
    }

    private void method3(){
        System.out.println("调用第三个默认方法");
    }

    public static void method4(){
        System.out.println("第一个静态方法");
        method6();
    }

    public static void method5(){
        System.out.println("第二个个静态方法");
        method6();
    }

    private static void method6(){
        System.out.println("调用第三个静态方法");
    }
}
