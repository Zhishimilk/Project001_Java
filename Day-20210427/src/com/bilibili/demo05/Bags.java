package com.bilibili.demo05;

public class Bags {

    int num = 10;
    public class money{

        int num = 20;
        private class  paper{

            int num = 50;
            public void papers(){
                System.out.println(num);
            }
        }

        public void pay(){

            int num = 30;
            System.out.println("付钱");
            System.out.println(num);
            System.out.println(money.this.num);
            System.out.println(Bags.this.num);
            new paper().papers();
            /*System.out.println(new Bags().num);*/

            class photo{
                int num = 40;
                public void photos(){
                    System.out.println(num);
                }
            }

            photo ph = new photo();
            ph.photos();
        }
    }

    public void open(){
        System.out.println("打开包");
        System.out.println(this.num);
        System.out.println(Bags.this.num);
    }
}
