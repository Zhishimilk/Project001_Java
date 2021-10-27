package endMode;

import java.util.ArrayList;

public class modeMain {

    public static void main(String[] args) {

        ArrayList<Double> list = new Manager().hairMoney(7, 100);

        for (int i = 0; list.size() != 0; i++) {

            Member mb = new Member();
            System.out.println(mb.getId()+" 号用户拿到了: "+mb.getMoney());
        }
    }
}
