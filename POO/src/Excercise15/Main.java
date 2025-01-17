package Excercise15;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("697707243", 88);
        MobilePhone phone1 = new MobilePhone("644785145", 80);
        Employee employee = new Employee("Baldassare", "z1998124g", 1.79f,74f, 0, phone);
        Employee employee1 = new Employee("John", "z6547826g", 1.75f, 72f, 0, phone1);
        Company company = new Company("John S.A", 0, employee, employee1);

        System.out.println(company.toString());

        company.work();
        company.work();
        company.work();
        System.out.println("------------ Company is working ------------");
        System.out.println("------------ Results ------------");
        System.out.println(company.toString());
    }
}
