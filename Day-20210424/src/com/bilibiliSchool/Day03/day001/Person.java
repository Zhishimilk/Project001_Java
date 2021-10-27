package com.bilibiliSchool.Day03.day001;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String str){
        name = str;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int num){
        age = num;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public void out_(String name){
        System.out.println("hello "+name+" my name is "+this.name);
        System.out.println(this);
    }
}
