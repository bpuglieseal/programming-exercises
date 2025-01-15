package Excercise11;

public class HourlyEmployee extends Employee {
    private float hours;
    private float wagehour;

    HourlyEmployee(String firstname, String lastname, String ssn, float hours, float wagehour) {
        super(firstname, lastname, ssn);
        this.hours = hours < 0 ? 0 : hours;
        this.wagehour = wagehour < 0 ? 0 : wagehour;
    }

    @Override
    float earning() {
        float wage = this.hours > 40 ? (float) (this.wagehour + this.wagehour * 0.5) : this.wagehour;
        return wage * this.hours;
    }

    @Override
    public String toString() {
        return String.format("%s, Wagehour: %f, Hours: %f", super.toString(), this.wagehour, this.hours);
    }
}
