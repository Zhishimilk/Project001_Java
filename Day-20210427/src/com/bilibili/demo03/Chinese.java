package com.bilibili.demo03;

import jdk.swing.interop.SwingInterOpUtils;

public class Chinese implements Person{
    @Override
    public void RestTime() {
        System.out.println("北京时间, 12:50");
    }

    @Override
    public void eat() {
        System.out.println("北京时间, 11:50");
    }
}
