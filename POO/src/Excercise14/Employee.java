package Excercise14;

public class Employee extends Person {
    private float money;
    MobilePhone phone;

    Employee(String name, String dni, float height, float weight, float money, MobilePhone phone) {
        super(name,  dni, height, weight);
        this.money = money;
        this.phone = phone;
    }

    public void earnMoney(float money) {
        this.money += money;
    }

    public void spendMoney(float money) {
        this.money -= money;
    }

    public void work() {
        this.phone.use();
        this.money += 10;
    }

    @Override
    public String toString() {
        return String.format("%s, Money: %f, Phone Battery: %d", super.toString(), this.money, this.phone.getBattery());
    }
}
