package com.bilibili.demo02;

public class Person {
        String name;
        int age;

        public Person() {
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

        @Override
        public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
        }

        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        public void eat(){
                System.out.println("吃饭");
        }
}
