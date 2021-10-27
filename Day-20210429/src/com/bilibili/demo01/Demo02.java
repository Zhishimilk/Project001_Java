package com.bilibili.demo01;

import java.util.Calendar;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        Calendar ite = Calendar.getInstance();
        System.out.println(ite);
        Date time = ite.getTime();
        System.out.println(time);
        ite.add(Calendar.MONTH, 1);
        System.out.println("-----------------------------------------");
        System.out.println(ite.get(Calendar.YEAR)+"/"+ite.get(Calendar.MONTH)+"/"+ite.get(Calendar.DATE));
        ite.set(Calendar.YEAR, 2022);
        System.out.println(ite.get(Calendar.YEAR)+"/"+ite.get(Calendar.MONTH)+"/"+ite.get(Calendar.DATE));
        ite.set(2077, 7, 7);
        System.out.println(ite.get(Calendar.YEAR)+"/"+ite.get(Calendar.MONTH)+"/"+ite.get(Calendar.DATE));
    }
}
