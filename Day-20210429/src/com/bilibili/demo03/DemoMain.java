package com.bilibili.demo03;

import java.util.Arrays;

public class DemoMain {

    public static void main(String[] args) {

        Integer num = Integer.valueOf(1);
        int i1 = num.intValue();
        String s1 = Integer.toString(i1);
        String s2 = String.valueOf(i1);
        int i2 = Integer.parseInt(s1);
        StringBuilder sb = new StringBuilder();
        Fu.method1();
        Zi.method1();
        new Zi().method();
        new Zi().method2();
        method7();
        Character.valueOf('a');


        sb.append("ZhangSan").append(18).append("岁");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb);
        System.out.println(i1+"#"+i2+"#"+s1+"#"+s2);
    }

    private static void method7(){

        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};

        System.arraycopy(arr2, 0, arr1, 2, 2);
        System.out.println(Arrays.toString(arr1));
    }
}