package Excercise11;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    BasePlusCommissionEmployee(String firstname, String lastname, String ssn, float grosssales, float commissionrate, float baseSalary) {
        super(firstname, lastname, ssn, grosssales, commissionrate);
        this.baseSalary = baseSalary < 0 ? 0 : baseSalary;
    }

    @Override
    float earning() {
        return super.earning() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s, Base Salary: %f", super.toString(), this.baseSalary);
    }
}
