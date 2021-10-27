package com.bilibili.demo02;

public class Zi extends Fu{

    String name = "wangwu";
    String named = "lisi";

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    @Override
    public void method1(){
        System.out.println("cba");
    }

    public void method3(){
        System.out.println("ccbbaa");
    }


    public void showName() {
        System.out.println(name);
    }

}
