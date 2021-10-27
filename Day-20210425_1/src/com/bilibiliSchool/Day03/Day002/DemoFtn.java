package com.bilibiliSchool.Day03.Day002;

import java.util.ArrayList;

public class DemoFtn {

    public void printList(ArrayList<Student> list){

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Student sd = list.get(i);
            System.out.print(sd.getName());
            if(i == list.size()-1){
                System.out.println("}");
            }else{
                System.out.print("@");
            }
        }
    }

    public ArrayList<Integer> SlcEvenNum(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num%2 == 0) {
                list1.add(num);
            }
        }

        return list1;
    }

    public String splicStr(char[] chAr){
        String str = "[";
        for (int i = 0; i < chAr.length; i++) {
            if(i == chAr.length-1){
                str += chAr[i]+"]";
            }else{
                str += chAr[i]+"#";
            }
        }
        return str;
    }
}
