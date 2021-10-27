package com.bilibili.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class demo02 {
    public static void main(String[] args) {

        ArrayList<String> pokers = new ArrayList<>();
        String[] colors = {"♥", "♣", "♠", "♦"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        pokers.add("Joker");
        pokers.add("joker");
        for (String num:
             nums) {
            for (String color:
                 colors) {
                pokers.add(num+color);
            }
        }

        /*System.out.println(pokers);*/
        method(pokers);
    }

    private static void method(ArrayList<String> list){
        Collections.shuffle(list);
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> hand = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i > 50){
                hand.add(list.get(i));
            }else if(i%3 == 0){
                player01.add(list.get(i));
            }else if(i%3 == 1){
                player02.add(list.get(i));
            }else if(i%3 == 2){
                player03.add(list.get(i));
            }
        }

        System.out.println("player01: "+player01);
        System.out.println("player02: "+player02);
        System.out.println("player03: "+player03);
        System.out.println("hand: "+hand);
    }
}
