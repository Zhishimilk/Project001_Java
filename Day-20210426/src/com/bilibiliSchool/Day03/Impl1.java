package com.bilibiliSchool.Day03;

public class Impl1 implements MyInterfaceAbstract{
    @Override
    public void methodAbs() {
        System.out.println("重写接口的抽象函数");
    }

    @Override
    public void methodAbs1() {

        System.out.println("重写接口的默认函数");
    }

    public void ftn(){

        System.out.println("子类创建特有的函数");
    }
}
