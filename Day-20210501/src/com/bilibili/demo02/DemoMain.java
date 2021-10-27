package com.bilibili.demo02;

import java.util.*;

public class DemoMain {

        public static void main(String[] args) {
            //定义存储套牌的容器
            HashMap<Integer, String> sshm = new HashMap<>();
            //定义随机顺序存储套牌的容器
            List<Integer> nums = new ArrayList<>();
            //定义key值
            int index = 0;
            //定义扑克牌
            List<String> list01 = List.of("♠", "♥", "♣", "♦");
            List<String> list02 = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
            //添加特殊的扑克牌
            nums.add(index);
            sshm.put(index++, "JOKER");
            nums.add(index);
            sshm.put(index++, "Joker");
            //
            for (String value:
                 list02) {
                for (String color:
                     list01) {
                    nums.add(index);
                    sshm.put(index++, value+color);
                }
            }
            /*System.out.println(sshm);*/

            /*Set<Integer> kSet = sshm.keySet();*/
            /*System.out.println(kSet);
            System.out.println(nums);*/
            Collections.shuffle(nums);
            /*System.out.println(nums);*/

            //
            ArrayList<Integer> player01 = new ArrayList<>();
            ArrayList<Integer> player02 = new ArrayList<>();
            ArrayList<Integer> player03 = new ArrayList<>();
            ArrayList<Integer> handPokers = new ArrayList<>();

            for (int i = 0; i < nums.size(); i++) {
                if(i > 50){
                    handPokers.add(nums.get(i));
                }else if(i%3 == 0){
                    player01.add(nums.get(i));
                }else if(i%3 == 1){
                    player02.add(nums.get(i));
                }else if(i%3 == 2){
                    player03.add(nums.get(i));
                }
            }

            LookPokers("张三", sshm, player01);
            LookPokers("李四", sshm, player02);
            LookPokers("王五", sshm, player03);
            LookPokers("底牌", sshm, handPokers);
        }

    private static void LookPokers(String name, HashMap<Integer, String> pokers, ArrayList<Integer> Hand) {

        Collections.sort(Hand);

        System.out.print(name+": [ ");

        for (int i = 0; i < Hand.size(); i++) {
            System.out.print(pokers.get(Hand.get(i))+" ");
        }

        System.out.println("]");
    }
}
