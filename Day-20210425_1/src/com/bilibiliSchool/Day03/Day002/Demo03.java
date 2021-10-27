package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;
import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rd.nextInt(100)+1);
        }
        System.out.println(list);
        System.out.println(new DemoFtn().SlcEvenNum(list));
    }
}
