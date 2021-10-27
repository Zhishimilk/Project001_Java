package com.bilibili.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoMain {

    public static void main(String[] args) {

        Collection<String> col1 = new ArrayList<>();
        Collection<Integer> col2 = new ArrayList<>();

        col1.add("张三");
        col1.add("李四");
        col1.add("王五");
        col2.add(1);
        col2.add(2);
        col2.add(3);
        col1.remove(null);

        for (String str:
             col1) {
            System.out.println(str);
        }

        Iterator<String> itt = col1.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }

        System.out.println(col1);
        System.out.println(col2);
        System.out.println("-------------------------------------");
        Object[] objects = col1.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i].toString()+"#");
        }
        System.out.println(objects.toString());
    }
}
