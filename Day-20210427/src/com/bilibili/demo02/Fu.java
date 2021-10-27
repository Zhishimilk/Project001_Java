package com.bilibili.demo02;

public class Fu {

    String name = "zhangsan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("ok");
    }

    public void method1(){
        System.out.println("abc");
    }

    public void method2(){
        System.out.println("aabbcc");
    }

    /*public void showName(){
        System.out.println(name);
    }*/
}
