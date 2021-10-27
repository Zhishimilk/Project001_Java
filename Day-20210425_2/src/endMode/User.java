package endMode;

public abstract class User {

    private int id;
    private double money;

    public User() {
    }

    public User(int id, double money) {
        this.id = id;
        this.money = money;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
