package com.bilibiliSchool.Day03.Day02;

public class TeacherClass extends EmployeeClass{

    String name = "张三";
    String sex = "女";

    public TeacherClass(){
        this(10);
    }

    public TeacherClass(int n){
        this(20, 30);
    }

    public TeacherClass(int n, int m){
        super(20);
        System.out.println("唉——————");
    }

    @Override
    public void method(){
        super.method();
        System.out.println("move");
    }

    public void method1(){
        System.out.println("again");
    }

    public void method2(){
        String name = "王五";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }

    @Override
    public void eat() {
        System.out.println("ok");
    }
}
