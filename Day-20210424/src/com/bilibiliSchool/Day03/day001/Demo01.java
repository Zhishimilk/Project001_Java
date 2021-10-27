package com.bilibiliSchool.Day03.day001;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Person ps = new Person();
        ps.setName(name);
        ps.setAge(21);
        new Demo01Ftn().Pout_("张三", 22);
        System.out.println("-----------------------------");
        new Demo01Ftn().Pout_(ps.getName(), ps.getAge());
        System.out.println("-----------------------------");
        new Demo01Ftn().Pout_(ps);
        System.out.println("-----------------------------");
        System.out.println(ps);
        System.out.println("-----------------------------");
        ps.out_("李四");
        System.out.println("-----------------------------");
        new Person().out_("王五");
    }

}
