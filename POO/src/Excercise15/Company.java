package Excercise15;

public class Company {
    private String name;
    private float profit;
    Employee owner;
    Employee manager;

    Company(String name, float profit, Employee owner, Employee manager) {
        this.name = name;
        this.profit = profit;
        this.owner = owner;
        this.manager = manager;
    }

    public void hireManager(Employee manager) {
        this.manager = manager;
    }

    public void work () {
        this.manager.work();
        this.owner.work();
        this.profit += 100f;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Profit: %f\n%s\n%s", this.name, this.profit, this.manager.toString(), this.owner.toString());
    }
}
