package com.bilibili.demo02;

public class DemoMain {
    public static void main(String[] args) {

        Fu Fzi = new Zi();
        Zi Zzi = new Zi();

        /*Fzi.method1();
        Fzi.method2();
        System.out.println(Fzi.name);*/
        System.out.println(Zzi.name);
        System.out.println("--------------------------");
        /*Fzi.setName("赵日天");*/
       /* Fzi.setName("李杀神");*/
        Zzi.setName("赵日天");
        /*Fzi.showName();*/
        Zzi.showName();
        /*System.out.println(Fzi.name);*/
        System.out.println("--------------------------");
        Fu dd = (Fu) Zzi;
        System.out.println(dd.name);
        /*Zi zi = (Zi) Fzi;
        zi.showName();*/
    }
}
