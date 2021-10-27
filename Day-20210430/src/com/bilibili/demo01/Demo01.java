package com.bilibili.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        Generic<String> gr = new Generic<String>();
        gr.setName("张三");
        System.out.println(gr.getName());
        Generic<Integer> ig = new Generic<>();
        ig.setName(233);
        System.out.println(ig.getName());
        ArrayList<Integer> ig01 = new ArrayList<>();
        ig01.add(1);
        ig01.add(2);
        ig01.toString();

        ig.method(10);
        ig.method("qbhn");
        gr.method(8.8);
        gr.method(false);

        Impl impl = new Impl();
        impl.method2("hello world");
        impl.method2(233);
        impl.method2(ig01);
    }

    private static void method7(ArrayList<?> list){

        Iterator<?> it = list.iterator();

        while (it.hasNext()){

            Object next = it.next();
            System.out.println(next);
        }
    }

    private static void method4(Collection<? extends Integer> coll){

    }

    private static void method5(Collection<? super Integer> coll){

    }
}
