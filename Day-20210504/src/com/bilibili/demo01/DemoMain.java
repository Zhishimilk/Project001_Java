package com.bilibili.demo01;

import java.util.Scanner;

public class DemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String user = sc.next();
        method(user);
        System.out.println("hello");
    }

    public static void method(String name){

        if (name.equals("admin")){
            try {
                throw new RegisterException("用户名已存在");
            } catch (RegisterException e) {
                e.printStackTrace();
            }
        }
    }
}
