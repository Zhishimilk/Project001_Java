package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;

public class Demo02 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Zhangsan", 18, false));
        list.add(new Student("Lisi", 18, false));
        list.add(new Student("Wangwu", 18, true));
        list.add(new Student("Zhaoritian", 18, false));

        for (int i = 0; i < list.size(); i++) {
            Student DD = list.get(i);
            System.out.println(DD.getName()+"###"+DD.getAge()+"###"+DD.isSex());
        }
            new DemoFtn().printList(list);
    }
}
