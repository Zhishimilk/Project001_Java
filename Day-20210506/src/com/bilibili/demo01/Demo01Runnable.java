package com.bilibili.demo01;

public class Demo01Runnable implements Runnable {

    static int num = 250;
    String key = new String();
    @Override
    public void run() {
        /*while (num > 0){
            synchronized (key){
                if(num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(num);
                    num--;
                }
            }
        }*/

        method();
    }

    public synchronized void method(){
        while (num > 0){
            if(num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(num);
                num--;
            }

        }
    }

    /*public static synchronized void method1(){

        synchronized (Demo01Runnable.class) {
            while (num > 0){
                if(num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(num);
                    num--;
                }
            }
        }
    }*/
}
