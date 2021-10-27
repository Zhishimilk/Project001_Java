package endMode;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{

    public Manager(){
        super();
    }
    public Manager(int id, double money) {
        super(id, money);
    }

    public ArrayList<Double> hairMoney(int n, int m) {
        ArrayList<Double> list = new ArrayList<>();
        Random rd = new Random();

        double surplus = m;
        for (int i = 0; i < n-1; i++) {
            int num = (int)surplus;
            double money = (double)rd.nextInt(num)/2+1;
            list.add(money);
            surplus -= money;
        }
        list.add(surplus);
        System.out.println(list);
        return list;
    }
}
