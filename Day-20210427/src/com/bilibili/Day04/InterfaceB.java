package com.bilibili.Day04;

public interface InterfaceB {
    public abstract void ftn1();

    public default void ftn4(){
        System.out.println("hello A");
    }
}
