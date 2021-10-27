package com.bilibili.demo04;

public class Person {

    String name;
    Weapon wp;
    Skill skill;

    public Person(String name, Weapon wp, Skill skill) {
        this.name = name;
        this.wp = wp;
        this.skill = skill;
    }

    public Person() {
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getDd() {
        return wp;
    }

    public void setDd(Weapon wp) {
        this.wp = wp;
    }

    public void free(){
        System.out.println(name);
        System.out.println(wp.code);
        skill.use();
    }
}
