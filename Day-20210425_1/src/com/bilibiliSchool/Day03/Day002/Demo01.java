package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("admin");
        String remove = list.remove(1);
        System.out.println(remove);
        boolean result = list.add("赵日天");
        System.out.println(result);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
    }
}
