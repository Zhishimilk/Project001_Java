package com.bilibili.demo02;

public class DemoMain {

    public static void main(String[] args) {

        Demo01Thread dt0 = new Demo01Thread();
        dt0.setName("DD");
        dt0.start();
        Demo01Thread dt1 = new Demo01Thread();
        dt1.start();
        System.out.println(Thread.currentThread().getName());
    }0
}
