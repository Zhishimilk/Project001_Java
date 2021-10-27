package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) {
        String s = new String();
        s = "abc";
        System.out.println("s = "+s);

        char[] c = {'a','b','c'};
        String s1 = new String(c);
        System.out.println("s1 = "+s1);

        byte[] b = {97, 98, 99};
        String s2 = new String(b);
        System.out.println("s2 = "+s2);

        String s3 = "abc";
        System.out.println("s3 = "+s3);

        System.out.println("s3 == s : "+(s3 == s));
        System.out.println("s1 == s : "+(s1 == s));
        System.out.println("s2 == s : "+(s2 == s));
        System.out.println("s1 == s2 : "+(s1 == s2));
        System.out.println(s == "abc");
        System.out.println(s3 == "abc");
        System.out.println(s3 == s);
    }
}
