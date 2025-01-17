package Excercise15;

public class MobilePhone {
    private String phoneNumber;
    private int battery;

    MobilePhone(String phoneNumber, int battery) {
        this.phoneNumber = phoneNumber;
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void use () {
        this.battery -= 1;
    }
}
