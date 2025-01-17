package Excercise14;

public class Person {
    private String name;
    private String dni;
    private float height;
    private float weight;

    Person(String name, String dni, float height, float weight) {
        this.name = name;
        this.dni = dni;
        this.height = height;
        this.weight = weight;
    }

    Person(String dni) {
        this.name = "";
        this.dni = dni;
        this.height = 0;
        this.weight = 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weight: %f", this.name, this.weight);
    }
}
