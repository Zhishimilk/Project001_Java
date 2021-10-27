package com.bilibili.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01Runnable implements Runnable {

    int num = 200;
    Lock lock = new ReentrantLock();
    String key = new String();
    @Override
    public void run() {
        while (num > 0){
            lock.lock();
            if(num > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(num);
                    num--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }
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

}
