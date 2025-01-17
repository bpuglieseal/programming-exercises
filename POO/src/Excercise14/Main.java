package Excercise14;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("697707243", 88);
        Employee employee = new Employee("Baldassare", "z1998124g", 1.79f,74f, 0, phone);
        System.out.println(employee.toString());

        employee.work();
        employee.work();
        employee.work();
        System.out.println("------------ Baldassare is working ------------");
        System.out.println("------------ Results ------------");
        System.out.println(employee.toString());
    }
}
