package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;
import java.util.Random;

public class RandomListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 6; i++) {

            list.add( rd.nextInt(33)+1);
        }
        System.out.println(list);
    }
}
