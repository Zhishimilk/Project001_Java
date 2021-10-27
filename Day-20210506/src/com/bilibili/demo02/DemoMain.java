package com.bilibili.demo02;

public class DemoMain {

    public static void main(String[] args) {

        /*for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        /*Demo01Runnable dr = new Demo01Runnable();

        new Thread(dr).start();*/

        /*new Thread(){
            @Override
            public void run() {
                System.out.println("dd");
            }
        }.start();*/

        /*Runnable rb =  new Runnable(){

            @Override
            public void run() {
                System.out.println("DD");
            }
        };

        new Thread(rb).start();*/

        /*Object obj = new Object();*/
        Runnable rb =  new Demo01Runnable();

        new Thread(rb).start();
        new Thread(rb).start();
        new Thread(rb).start();

        new Person()
    }
}
