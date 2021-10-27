package com.bilibili.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoP {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        method(scanner.next());

    }

    private static void method(String birth) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date birthDay = sdf.parse(birth);
        System.out.println("出生日: "+ birthDay);
        Date nowDay = new Date();
        System.out.println("当前时间: "+nowDay);
        long time1 = birthDay.getTime();
        long time2 = nowDay.getTime();
        System.out.println(time1+"###"+time2);

        long Days = (time2 - time1) / (24*60*60*1000);
        System.out.println("如今已经过去 "+Days+" 天了");
    }
}
