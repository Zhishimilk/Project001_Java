package com.bilibili.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoList {

    /*@Override
    public String toString() {
        return "DemoList{}";
    }*/

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DemoList)) return false;
            DemoList demoList = (DemoList) o;
            return age == demoList.age && name.equals(demoList.name);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoList demoList = (DemoList) o;
        return this.age == demoList.age && Objects.equals(name, demoList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    public DemoList(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DemoList() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
