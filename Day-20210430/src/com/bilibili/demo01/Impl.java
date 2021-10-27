package com.bilibili.demo01;

public class Impl<E> implements InterfaceAbstract<E>{
    @Override
    public void method2(E e) {
        System.out.println(e);
    }
}

