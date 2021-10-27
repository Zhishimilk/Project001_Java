package com.bilibili.demo01;

import java.text.*;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws ParseException {

        method();
    }

    private static void method() throws ParseException {

        Date dt = new Date();
        long tm = dt.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date pr = sdf.parse("2021/04/29 11:38:06");

        System.out.println(System.currentTimeMillis());
        System.out.println(dt);
        System.out.println(tm);
        System.out.println(sdf.format(dt));
        System.out.println(pr);
    }
}
