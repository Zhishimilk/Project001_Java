package com.bilibili.demo1;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {

        DemoList de = new DemoList("Zhangsan", 18);
        DemoList de1= new DemoList("Zhangsan", 18);
        DemoList de2= new DemoList("Zhangsan", 18);
        Object de3 = new DemoList1(100.0, 3);
        String str = "Zhangsan";
        Date dt = new Date();
        //public boolean equals(Object obj) {
        //        return (this == obj);
        //    }
        System.out.println(de);
        System.out.println(de1);
        System.out.println(de2);
        System.out.println(de.equals(de1));
        System.out.println(de1.equals(de2));
        System.out.println(de2.equals(de3));
        System.out.println(de);
        System.out.println(de1);
        System.out.println(de2);
        System.out.println("-----------------------------------");
        System.out.println(de3 instanceof DemoList);
        /*DemoList de4 = (DemoList) de3;*/
    }
}
