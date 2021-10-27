package com.bilibili.demo04;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {

    public static void main(String[] args) {

        Skill sk = new Skill() {
            @Override
            public void use() {
                System.out.println(":(");
            }
        };
        Weapon wp = new Weapon("火之高兴");
        SkillUse su = new SkillUse();
        Person ps = new Person("张三", wp, su);
        ps.free();
        ps.setSkill(sk);
        Person psn = new Person("张三", wp, sk);
        psn.free();
        ps.free();
        /*System.out.println(ps.getName()+"###"+ps.getDd().code);*/

        List<String> list = new ArrayList<>();
    }
}
