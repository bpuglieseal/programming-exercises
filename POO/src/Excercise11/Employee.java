package Excercise11;

public abstract class Employee {
    private String firstname;
    private String lastname;
    private String ssn;

    Employee(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    abstract float earning();

    @Override
    public String toString() {
        return String.format("Firstname: %s, Lastname: %s, SSN: %s", this.firstname, this.lastname, this.ssn);
    }
}
