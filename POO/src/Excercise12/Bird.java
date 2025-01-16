package Excercise12;

public class Bird {
    private Sex sex;
    private int age;
    private static int numberOfBirds = 0;

    Bird (Sex sex, int age) {
        this.sex = sex;
        this.age = age;
        numberOfBirds += 1;
    }

    private int getNumberOfBirds () {
        return numberOfBirds;
    }

    public void whoAmI () {
        System.out.format("Sex: %s, Age: %d", getVerboseSex(this.sex), this.age);
    }

    public static String getVerboseSex (Sex sex) {
        switch (sex) {
            case MALE -> {return "Male";}
            case FEMALE -> {return "Female";}
            default -> {return "";}
        }
    }
}
