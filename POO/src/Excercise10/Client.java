package Excercise10;

public class Client {
    private String name;
    private String idNumber;

    Client(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }
}
