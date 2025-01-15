package Excercise11;

public class SalariedEmployee extends Employee {
    private float weeklysalary;

    SalariedEmployee(String firstname, String lastname, String ssn, float weeklysalary) {
        super(firstname, lastname, ssn);
        this.weeklysalary = weeklysalary < 0 ? 0 : weeklysalary;
    }

    @Override
    float earning() {
        return this.weeklysalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
