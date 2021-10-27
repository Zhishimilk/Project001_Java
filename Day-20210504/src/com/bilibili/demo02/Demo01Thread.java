package com.bilibili.demo02;

public class Demo01Thread extends Thread{

    @Override
    public void run(){

        /*for (int i = 0; i < 20; i++) {
            System.out.println("run: "+i);
        }*/
        /*System.out.println(getName());*/

        System.out.println(Thread.currentThread().getName());
    }

    public Demo01Thread() {
    }

    public Demo01Thread(String name) {
        super(name);
    }
}
