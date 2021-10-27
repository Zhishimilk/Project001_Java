package com.bilibiliSchool.Day03.Day02;

public abstract class EmployeeClass {

    public EmployeeClass(int num){

    }

//    public EmployeeClass(){
//
//    }

    static {

        System.out.println("first once");
    }

    String name = "李四";

    public void method(){
        System.out.println("action");
    }

    public void method3(){
        System.out.println(name);
    }

    public abstract void eat();
}
