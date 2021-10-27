package endMode;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member(){ super(); }
    public Member(int id, double money) {
        super(id, money);
    }

    public void getMoneys(ArrayList<Double> list){
        Random rd = new Random();
        this.setMoney(list.remove(rd.nextInt(list.size())));
        System.out.println("剩余钱包:"+this.getMoney());
    }
}
