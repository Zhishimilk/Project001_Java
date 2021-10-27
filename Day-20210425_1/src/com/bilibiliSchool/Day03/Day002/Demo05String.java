package com.bilibiliSchool.Day03.Day002;

import java.nio.charset.StandardCharsets;

public class Demo05String {

    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(str.substring(str.indexOf('W'), str.indexOf('d', str.indexOf('W'))+1));
        char[] chAr = str.toCharArray();
        byte[] btAr = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < chAr.length; i++) {
            System.out.print(chAr[i]);
            System.out.println("#"+btAr[i]);
        }



        String replace = str.replace("o", "*");
        System.out.println(replace);
        System.out.println(new DemoFtn().splicStr(chAr));
    }
}
