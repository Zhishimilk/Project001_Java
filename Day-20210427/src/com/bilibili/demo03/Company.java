package com.bilibili.demo03;

public class Company {

    public void ToWork(){
        System.out.println("公司开门");
    }

    public void OffWork(){
        System.out.println("公司关门");
    }

    public void WorkMan(Person person){
        person.RestTime();
        person.eat();
    }
}
