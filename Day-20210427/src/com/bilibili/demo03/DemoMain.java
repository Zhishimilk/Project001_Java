package com.bilibili.demo03;

public class DemoMain {
    public static void main(String[] args) {

        Company company = new Company();

        company.ToWork();

        Chinese chinese = new Chinese();
        American american = new American();

        company.WorkMan(chinese);
        System.out.println("-------------------");
        company.WorkMan(american);

        company.OffWork();
    }
}
