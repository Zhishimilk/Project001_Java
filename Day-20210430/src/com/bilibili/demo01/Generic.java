package com.bilibili.demo01;
//泛型的类
public class Generic<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public <E> void method(E e){
        System.out.println(e);
    }
}
