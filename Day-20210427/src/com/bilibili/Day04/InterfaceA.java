package com.bilibili.Day04;

public interface InterfaceA {
    public abstract void ftn1();
    public default void ftn3(){
        System.out.println("hello A");
    }
}
