package com.bilibili.demo01;

import java.util.*;

public class DemoMain {

    public static void main(String[] args) {

        /*LinkedList<Integer> ig = new LinkedList<>();
        ig.addLast(1);
        ig.addLast(2);
        ig.add(3);
        ig.push(0);
        ig.pop();


        System.out.println(ig);

        System.out.println("-----------------------------");

        HashSet<Person> pl = new LinkedHashSet<>();
        pl.add(new Person("张三", 18));
        pl.add(new Person("张三", 18));
        pl.add(new Person("李四", 18));
        pl.add(new Person("王五", 18));

        Iterator<Person> ite = pl.iterator();

        while (ite.hasNext()){

            Person next = ite.next();
            System.out.println(next);
        }
        System.out.println("------------------------------");*/

        /*ArrayList<Integer> ig = new ArrayList<>();
        Collections.addAll(ig, 5,1,3,2,4,8,6,9,7,0);
        System.out.println(ig);
        Collections.sort(ig, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(ig);
        Collections.sort(ig, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(ig);

        System.out.println("-------------------------------");*/

        HashMap<Integer, String> hmp = new HashMap<>();
        hmp.put(1, "a");
        hmp.put(2, "b");
        hmp.put(3, "c");
        hmp.put(4, "a");
        Set<Map.Entry<Integer, String>> es = hmp.entrySet();
        System.out.println(es);
        System.out.println(hmp);
        Person zi = new zi();

        /*Map.Entry<Object, Object> entry = Map.entry(1,1);*/

    }
}
