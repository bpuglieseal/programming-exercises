package Excercise12;

public class Canary extends Bird {
    private float size;

    Canary(Sex sex, int age) {
        super(sex, age);
        this.size = 0;
    }

    Canary(Sex sex, int age, float size) {
        super(sex, age);
        this.size = size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void height() {
        if (this.size > 30) {
            System.out.println("High");
        } else if (this.size > 14 && this.size < 31) {
            System.out.println("Middle");
        } else {
            System.out.println("Little");
        }
    }
}
