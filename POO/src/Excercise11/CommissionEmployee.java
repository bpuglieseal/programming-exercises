package Excercise11;

public class CommissionEmployee extends Employee {
    private float grosssales;
    private float commissionrate;

    CommissionEmployee(String firstname, String lastname, String ssn, float grosssales, float commissionrate) {
        super(firstname, lastname, ssn);
        this.grosssales = grosssales < 0 ? 0 : grosssales;
        this.commissionrate = commissionrate < 0 ? 0 : commissionrate;
    }

    @Override
    float earning() {
        return this.commissionrate * this.grosssales;
    }

    @Override
    public String toString() {
        return String.format("%s, Commissionrate: %f, Grosssales: %f", super.toString(), this.commissionrate, this.grosssales);
    }
}
